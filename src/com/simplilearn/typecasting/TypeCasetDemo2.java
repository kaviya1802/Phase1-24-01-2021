package com.simplilearn.typecasting;

public class TypeCasetDemo2 {

	public static void main(String[] args) {
		// Type Casting : process of converting data from one data type to another.
		/**
		 * Narrowing : Converting data from Higher range to lower value 
		 * double -> float -> long -> int -> short -> byte
		 */

		
		double decimalCount = 111.77d; // long to double
		
		long bigCount = (long) decimalCount; // double to long
		
		int intCout = (int) bigCount;
		
		short shortCount = (short) intCout;
		
		byte byteCount = (byte) decimalCount;
		
		System.out.println("Double  Count :: "+decimalCount);
		System.out.println("Byte Count :: "+byteCount);		 // ctrl +/
		System.out.println("Int Count :: "+intCout);
		System.out.println("Long Count :: "+bigCount);
		System.out.println("Short Count :: "+shortCount);
		
		
		
		
	}

}
