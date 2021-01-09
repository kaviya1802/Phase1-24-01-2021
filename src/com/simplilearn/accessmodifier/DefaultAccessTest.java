package com.simplilearn.accessmodifier;

public class DefaultAccessTest {

	public static void main(String[] args) {
		Hero  h = new Hero();
		
		System.out.println(h.name);
		System.out.println(h.power);
		System.out.println(h.showPower());
		
		h.showAll();
		

	}

}
