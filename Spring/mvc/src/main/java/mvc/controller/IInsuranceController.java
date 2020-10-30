package mvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import mvc.model.IInsurance;
import mvc.repository.InsuranceRepository;

@Controller
public class IInsuranceController {

	ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
	
	IInsurance iIDetails= ctx.getBean("iModel",IInsurance.class);
	InsuranceRepository iIRepo=ctx.getBean("repo",InsuranceRepository.class);
	
	@GetMapping("/")
	public String getIndexPage()
	{
		return "index";
	}
	
	@PostMapping("/savePolicy")
	public String saveInsuranceDetails(@ModelAttribute("iIData") IInsurance iIData,ModelMap model)
	{
		this.iIRepo.addPolicy(iIData);
		model.addAttribute("iIList", this.iIRepo.getPolicy());
		return "index";
	}
	
}
