package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;

public class Dog extends PetAnimal {
    public Dog() {
        super((new BirdSoundHelper(BirdSoundEnums.DOG)));
    }

    public Dog(BirdSoundHelper singHelper) {
        super(singHelper);
    }
}
