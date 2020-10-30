package mvc.repository;

import java.util.ArrayList;
import java.util.List;

import mvc.model.IInsurance;

public class InsuranceRepository {
	List<IInsurance> iIDetails;
	
	public InsuranceRepository()
	{
		this.iIDetails=new ArrayList();
	}
	public List<IInsurance> getPolicy()
	{
		return this.iIDetails;
	}
	public void setPolicy(List<IInsurance> iIDetails)
	{
		this.iIDetails=iIDetails;
	}
	public void addPolicy(IInsurance IData)
	{
		this.iIDetails.add(IData);
	}
	public void deletePolicy(int iId)
	{
		this.iIDetails.remove(iId);
	}
	
}
