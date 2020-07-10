package com.media2359.model;

import com.media2359.utils.Constant;

public class Clownfish extends Fish {


	 public void bodySize() {
    	 System.out.print(Constant.SIZE_SMALL);
    }

    public void bodyColor() {
    	System.out.print(Constant.COLOR_ORANGE);
    }

    public void makeJoke() {
        System.out.print(Constant.MAKE_JOKES);
    }
}
