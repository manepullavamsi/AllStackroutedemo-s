package com.pratice.services;

@Service("speakerService")

public class Appservice {
	String name;

	public Appservice(String name) {
		super();
		this.name = name;
	}
	public Appservice()
	{
		System.out.println("this no args constructor");
	}
	@AutoWired
	public void setName(String name) {
		this.name = name;
	}
	
	

}
