package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.Flyable;
import com.media2359.props.Speakable;
import com.media2359.props.Walkable;
import com.media2359.utils.Constant;

public class Bird extends Animal implements Walkable, Speakable, Flyable {

    private BirdSoundHelper singHelper;

    public Bird() {
        this.singHelper = new BirdSoundHelper(BirdSoundEnums.DEFAULT);
    }

    public Bird(BirdSoundHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.print(Constant.CAN_WALK);
    }


    public void canFly() {
        System.out.print(Constant.CAN_FLY);
    }
}
