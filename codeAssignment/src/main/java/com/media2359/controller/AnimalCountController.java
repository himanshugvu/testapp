package com.media2359.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.media2359.helper.AnimalCountHelper;
import com.media2359.model.Animal;
import com.media2359.model.Bird;
import com.media2359.model.Butterfly;
import com.media2359.model.Cat;
import com.media2359.model.Chicken;
import com.media2359.model.Clownfish;
import com.media2359.model.Dog;
import com.media2359.model.Dolphin;
import com.media2359.model.Duck;
import com.media2359.model.Fish;
import com.media2359.model.Parrot;
import com.media2359.model.Rooster;
import com.media2359.model.Shark;

@RestController
public class AnimalCountController {

	@GetMapping("/")
	public AnimalCountHelper getAnimalCount() {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Dog(), new Butterfly(), new Cat() };
		AnimalCountHelper animalCount = new AnimalCountHelper(animals);
		return animalCount;
	}
}
