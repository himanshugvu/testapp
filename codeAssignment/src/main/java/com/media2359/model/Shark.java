package com.media2359.model;

import com.media2359.utils.Constant;

public class Shark extends Fish {


    public void bodySize() {
    	 System.out.print(Constant.SIZE_LARGE);
    }

    public void bodyColor() {
    	System.out.print(Constant.COLOR_GREY);
    }

    public void canEat() {
        System.out.print(Constant.EAT_FISH);
    }
}
