package com.simplilearn.typecasting;

import java.util.Scanner;

public class StringtoNumberConversionUserInput {

	public static void main(String[] args) {
		// String to Numeric Conversion -> Note : The String should be a convertible value
		// Wrapper class
		
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("Welcome to Numeric Convertor");
		System.out.println("Enter a string number value");
		System.out.println("-----------------------------");
		String price = input.next();
		
		int priceInt = Integer.parseInt(price);
		byte priceByte = Byte.parseByte(price);
		double priceDouble = Double.parseDouble(price);
		
		
		System.out.println("Integer Price :: "+priceInt);
		System.out.println("Byte Price :: "+priceByte);
		System.out.println("Double Price :: "+priceDouble);
		

	}

}
