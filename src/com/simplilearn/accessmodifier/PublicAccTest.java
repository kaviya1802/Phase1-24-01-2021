package com.simplilearn.accessmodifier;

public class PublicAccTest {

	public static void main(String[] args) {
		// create instance or object
		Father father = new Father();
		
		father.showAll();
		System.out.println("Park $ "+father.park);
		System.out.println("Donation $ "+father.donation);
		
		System.out.println("Park # "+father.showPark());
		System.out.println("Donation # "+father.showDonation());

	}

}

class Father {
	
	public String park= "Silver Haven Park";
	
	public double donation = 38476.43;
	
	public String showPark() {
		return park;
	}
	
	public double showDonation() {
		return donation;
	}
	
	public void showAll() {
		System.out.println("Park : "+park);		
		System.out.println("Donation : "+showDonation());
	}
}
