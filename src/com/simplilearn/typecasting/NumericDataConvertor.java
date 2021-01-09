package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		//step 1 : collect user input (console)
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Welcome to Numeric Convertor");
		System.out.println("Enter a integer number value");
		System.out.println("-----------------------------");
		int userIn = input.nextInt();
		
		
		// step 2 : convert values into different 
		long bigValue = userIn;
		float floatValue = userIn;
		double doubleValue = userIn;
		byte byteValue = (byte) userIn;
		short shortValue = (short) userIn;
		
		// step 3 : print converted values
	
		System.out.println("Long Count :: "+bigValue);
		System.out.println("Float  Count :: "+floatValue);
		System.out.println("Double  Count :: "+doubleValue);
		System.out.println("Byte  Count :: "+byteValue);
		System.out.println("Short  Count :: "+shortValue);

	}

}
