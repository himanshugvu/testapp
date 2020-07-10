package com.media2359.enums;

public enum BirdSoundEnums {
	DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CAT("Meow"),
    DEFAULT("Singing"),
    NO_SOUND("");
	
    private String sound;

    BirdSoundEnums(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
