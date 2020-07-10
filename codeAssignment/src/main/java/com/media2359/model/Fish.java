package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.NotSpeakable;
import com.media2359.props.PhysicalAppearance;
import com.media2359.props.Swimmable;
import com.media2359.props.Walkable;
import com.media2359.utils.Constant;

public class Fish extends Animal implements Swimmable, NotSpeakable, PhysicalAppearance {
	private BirdSoundHelper singHelper;

	public Fish() {
		this.singHelper = new BirdSoundHelper(BirdSoundEnums.NO_SOUND);
	}

	public void callSound() {
		singHelper.makeSound();
	}

	public void canSwim() {
		System.out.print(Constant.CAN_SWIM);
	}

	public void canWalk() {
		System.out.print(Constant.CAN_NOT_WALK);
	}

	public void bodySize() {
	}

	public void bodyColor() {
	}
}
