package com.cnsbdc.practice;

public class PlayingCat {
	
    public boolean isCatPlaying(boolean summer,int temperature){
        if(summer){
            if(temperature>=24 && temperature<=43){
                return true;
            }else{
                return false;
            }
        }else{
            if(temperature>=24 && temperature<=34){
                return true;
            }else{
                return false;
            }
        }
    }
}
