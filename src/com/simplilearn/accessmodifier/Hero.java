package com.simplilearn.accessmodifier;

public class Hero {

	String name = "Wolworeen";
	String power = "Healing Power";	
	
	String showPower() {
		return power;
	}
	
	public void showAll() {
		//within same class
		System.out.println("Hero : "+ name);		
		System.out.println("Call Money : "+showPower());
	}
}
