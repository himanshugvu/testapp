package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.Speakable;
import com.media2359.props.Walkable;
import com.media2359.utils.Constant;

public abstract class PetAnimal extends Animal implements Walkable, Speakable {
    private BirdSoundHelper singHelper;

    public PetAnimal() {
        this.singHelper = new BirdSoundHelper(BirdSoundEnums.DEFAULT);
    }

    public PetAnimal(BirdSoundHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.CAN_WALK);
    }
}
	