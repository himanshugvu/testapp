package com.media2359.model;

import com.media2359.props.Swimmable;
import com.media2359.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
	
	public void canSwim() {
		System.out.print(Constant.CAN_SWIM);
	}
}
