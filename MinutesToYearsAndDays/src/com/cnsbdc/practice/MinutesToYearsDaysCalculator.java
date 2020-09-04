package com.cnsbdc.practice;

public class MinutesToYearsDaysCalculator {
    
    public void printYearsAndDays(long minutes){
        
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long day = minutes/(24*60);
            long year = day/365;
            long remainderDay = day%365;
            
            System.out.println(minutes+" MIN = "+year+" Y and "+remainderDay+" D");
        }
    }
}