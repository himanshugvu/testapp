package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.props.Flyable;
import com.media2359.utils.Constant;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new BirdSoundHelper(BirdSoundEnums.DEFAULT));
    }

    public Parrot(BirdSoundHelper singHelper) {
        super(singHelper);
    }

    public void canFly() {
        System.out.println(Constant.CAN_FLY);
    }
}
