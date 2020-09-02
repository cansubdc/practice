package com.cnsbdc.practice;

public class Main {

	public static void main(String[] args) {

		Wall wall =  new  Wall(4,3);
		System.out.println("Width: "  + wall.getWidth()+", Height: "  + wall.getHeight());
		System.out.println("Area: "  + wall.getArea()+"\n");
		
		wall.setHeight(-3);
		System.out.println("Width: "  + wall.getWidth()+", Height: "  + wall.getHeight());
		System.out.println("Area: "  + wall.getArea()); 
	}
}
