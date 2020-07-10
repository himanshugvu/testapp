package com.media2359.helper;

import com.media2359.enums.BirdSoundEnums;

public class BirdSoundHelper {
    private BirdSoundEnums soundEnums;

    public BirdSoundHelper(BirdSoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.print(soundEnums.getSound());
    }
}
