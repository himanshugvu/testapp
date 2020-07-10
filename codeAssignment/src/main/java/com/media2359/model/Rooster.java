package com.media2359.model;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.helper.LanguageEnums;
import com.media2359.helper.LanguageTranslateHelper;

public class Rooster extends Chicken {

	LanguageTranslateHelper languageHelper;
	LanguageEnums languageEnums;
	BirdSoundHelper birdSoundHelper;

	public Rooster() {
		this.birdSoundHelper = new BirdSoundHelper(BirdSoundEnums.ROOSTER);
	}

	public Rooster(LanguageEnums languageEnums) {
		this.birdSoundHelper = new BirdSoundHelper(BirdSoundEnums.ROOSTER);
		this.languageEnums = languageEnums;
	}

	public Rooster(BirdSoundHelper singHelper) {
		super(singHelper);
	}

	public void canFly() {
		super.canFly();
	}

	@Override
	public void callSound() {
		String translate = LanguageTranslateHelper.translate(BirdSoundEnums.ROOSTER.getSound(), languageEnums);
		System.out.print(translate);

	}

}
