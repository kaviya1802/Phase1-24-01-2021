package com.simplilearn.accessmodifier;

public class PrivateAccTest {

	public static void main(String[] args) {
		// create instance or object
		Mother father = new Mother();
		
		father.showAll();
		// father.bankMoney; // private variable 
		// father.showMoney(); // private method

	}

}
// encapsulation 
class Mother {
	
	private double bankMoney = 38476.43;	
	
	private double showMoney() {
		return bankMoney;
	}
	
	public void showAll() {
		System.out.println("Money : "+bankMoney);		
		System.out.println("Call Money : "+showMoney());
	}
}
