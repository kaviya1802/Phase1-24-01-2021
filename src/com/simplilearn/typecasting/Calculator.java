package com.simplilearn.typecasting;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// step 1 : collect user input (console)
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------");
		System.out.println("Welcome to Calculator");
		System.out.println("-----------------------------");
		
		System.out.println("Enter number value ");
		int number1 = input.nextInt();
		
		System.out.println("Enter number value ");
		int number2 = input.nextInt();
		
		System.out.println("Addition : " + add(number1,number2));
		System.out.println("Substartion : " + sub(number1,number2));
		System.out.println("Multiplication : " + mul(number1,number2));
		System.out.println("Division : " + div(number1,number2));
	}
	
	public static byte add(int number1 , int number2) {
		return (byte) (number1 + number2);
	}
	
	public static double mul(int number1 , int number2) {
		return  (number1 * number2);
	}
	
	public static short sub(int number1 , int number2) {
		return (short) (number1 - number2);
	}
	
	public static float div(int number1 , int number2) {
		return  (number1 / number2);
	}

}
