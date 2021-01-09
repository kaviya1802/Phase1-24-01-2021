package com.simplilearn.accessB;

public class Hero {
	
	public String name = "Wolworeen";
	protected String power = "Healing Power";	
	
	protected String showPower() {
		return power;
	}
	
	public void showAll() {
		//within same class
		System.out.println("Hero : "+ name);		
		System.out.println("Call Money : "+showPower());
	}
}
