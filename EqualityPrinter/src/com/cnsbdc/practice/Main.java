package com.cnsbdc.practice;

public class Main {

	public static void main(String[] args) {
		
		IntEqualityPrinter number = new IntEqualityPrinter();
		
		number.printEqual(1, 2, 3);
		number.printEqual(5, 5, 5);
		number.printEqual(1, 2, 2);
		number.printEqual(-5, 5, 5);
	}

}
