package com.simplilearn.typecasting;

public class TypeCasetDemo {

	public static void main(String[] args) {
		// Type Casting : process of converting data from one data type to another.
		/**
		 * Widening : Converting data from lower range to higher value 
		 * byte -> short-> int -> log -> float -> double.
		 */
		
		byte  byteCount  = 100;  // -128 to 127 -> 1 byte = 8 bit
		
		
		int integerCount = byteCount; // widening or implicit or automatic -> -32786 to 32767 
		
		long bigCount = byteCount; // byte -> long
		
		float floatCount = bigCount;  // long to float
		
		double decimalCount = bigCount; // long to double
		
		System.out.println("Byte Count :: "+byteCount);		
		System.out.println("Int Count :: "+integerCount);
		System.out.println("Long Count :: "+bigCount);
		System.out.println("Float  Count :: "+floatCount);
		System.out.println("Double  Count :: "+decimalCount);
		
		
		
	}

}
