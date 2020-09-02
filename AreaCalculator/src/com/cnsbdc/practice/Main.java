package com.cnsbdc.practice;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Radius = "+ 3.0 +" Area ="+AreaCalculator.area(3.0));
		System.out.println("Radius = "+ -3 +" Area ="+AreaCalculator.area(-3));
		
		System.out.println("x = 3.0 y = 4.0 Area =" +AreaCalculator.area(3.0, 4.0));
		System.out.println("x = -3.0 y = 4.0 Area =" +AreaCalculator.area(-3.0, 4.0));
		System.out.println("x = -3.0 y = -4.0 Area ="+AreaCalculator.area(-3.0, -4.0));
	}
}
