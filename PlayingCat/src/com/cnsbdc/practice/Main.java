package com.cnsbdc.practice;

public class Main {
	
	public static void main(String[] args) {
		
		PlayingCat cat = new PlayingCat();
		
		System.out.println(cat.isCatPlaying(true, 15));
		System.out.println(cat.isCatPlaying(true, 26));
		System.out.println(cat.isCatPlaying(false, 35));
		System.out.println(cat.isCatPlaying(false, 34));
	}
}
