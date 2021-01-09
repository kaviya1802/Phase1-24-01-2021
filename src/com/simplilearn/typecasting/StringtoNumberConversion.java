package com.simplilearn.typecasting;

public class StringtoNumberConversion {

	public static void main(String[] args) {
		// String to Numeric Conversion -> Note : The String should be a convertible value
		// Wrapper class
		
		String  price = "124";  // convertible value
		String  price2 = "124abc";  // non-convertible value
		
		int priceInt = Integer.parseInt(price2);
		byte priceByte = Byte.parseByte(price2);
		double priceDouble = Double.parseDouble(price2);
		
		
		System.out.println("Integer Price :: "+priceInt);
		System.out.println("Byte Price :: "+priceByte);
		System.out.println("Double Price :: "+priceDouble);
		

	}

}
