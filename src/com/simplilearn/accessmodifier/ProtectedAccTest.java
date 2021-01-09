package com.simplilearn.accessmodifier;

import com.simplilearn.accessB.Hero;

public class ProtectedAccTest extends Hero{

	public static void main(String[] args) {
		// create instance or object
		ProtectedAccTest hero = new ProtectedAccTest();
		
		System.out.println(hero.name);
		System.out.println(hero.power);
		System.out.println(hero.showPower());
		
		hero.showAll();
		

	}

}

