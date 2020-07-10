package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.Flyable;
import com.media2359.props.Swimmable;
import com.media2359.utils.Constant;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super(new BirdSoundHelper(BirdSoundEnums.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.print(Constant.CAN_FLY);
    }

    public void canSwim() {
        System.out.print(Constant.CAN_SWIM);
    }
}
