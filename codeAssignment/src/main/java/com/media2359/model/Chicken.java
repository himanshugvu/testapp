package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.NotFlyable;
import com.media2359.utils.Constant;

public class Chicken extends Bird implements NotFlyable {
    public Chicken() {
        super(new BirdSoundHelper(BirdSoundEnums.CHICKEN));
    }

    public Chicken(BirdSoundHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.print(Constant.CAN_NOT_FLY);
    }
}
