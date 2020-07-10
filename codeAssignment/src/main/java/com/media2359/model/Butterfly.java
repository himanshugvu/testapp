package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.NotFlyable;
import com.media2359.props.NotSpeakable;
import com.media2359.props.Walkable;
import com.media2359.utils.Constant;

public class Butterfly extends Caterpillar implements NotFlyable,NotSpeakable{
	
	private BirdSoundHelper singHelper;

	public Butterfly() {
		this.singHelper = new BirdSoundHelper(BirdSoundEnums.NO_SOUND);
	}

	public void canFly() {
        System.out.print(Constant.CAN_FLY);
    }

	public void callSound() {
		singHelper.makeSound();
	}
	
}
