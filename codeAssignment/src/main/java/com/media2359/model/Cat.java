package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;

public class Cat extends PetAnimal {
    public Cat() {
        super(new BirdSoundHelper(BirdSoundEnums.CAT));
    }

    public Cat(BirdSoundHelper singHelper) {
        super(singHelper);
    }
}
