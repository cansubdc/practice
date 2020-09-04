package com.cnsbdc.practice;

public class IntEqualityPrinter {
    public void printEqual(int a, int b, int c){
        
        if(a<0 || b<0 || c<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            if(a == b && b == c){
                System.out.println("Numbers are equal");
            }
            else if(a == b || a==c || b==c){
                System.out.println("Neither all are equal/different");
            }else{
                System.out.println("Numbers are different");
            }
        }
    }
}