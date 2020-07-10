package com.media2359.helper;

import com.media2359.model.Animal;
import com.media2359.props.Flyable;
import com.media2359.props.Walkable;
import com.media2359.props.Speakable;
import com.media2359.props.Swimmable;

public class AnimalCountHelper {
	Animal[] animals;
	int flyCount = 0;
	int walkCount = 0;
	int speakCount = 0;
	int swimCount = 0;

	public AnimalCountHelper(Animal[] animals) {
		this.animals = animals;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Flyable) {
				flyCount += 1;
			}
			if (animals[i] instanceof Walkable) {
				walkCount += 1;
			}
			if (animals[i] instanceof Speakable) {
				speakCount += 1;
			}
			if (animals[i] instanceof Swimmable) {
				swimCount += 1;
			}
		}
	}

	public int getFlyCount() {
		return flyCount;
	}

	public void setFlyCount(int flyCount) {
		this.flyCount = flyCount;
	}

	public int getWalkCount() {
		return walkCount;
	}

	public void setWalkCount(int walkCount) {
		this.walkCount = walkCount;
	}

	public int getSpeakCount() {
		return speakCount;
	}

	public void setSpeakCount(int speakCount) {
		this.speakCount = speakCount;
	}

	public int getSwimCount() {
		return swimCount;
	}

	public void setSwimCount(int swimCount) {
		this.swimCount = swimCount;
	}

}
