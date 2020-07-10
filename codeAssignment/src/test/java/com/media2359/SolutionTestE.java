package com.media2359;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

public class SolutionTestE {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	@Test
	void countAnimalBehaviour() {
		  Animal[] animals = new Animal[]{
	                new Bird(),
	                new Duck(),
	                new Chicken(),
	                new Rooster(),
	                new Parrot(),
	                new Fish(),
	                new Shark(),
	                new Clownfish(),
	                new Dolphin(),
	                new Dog(),
	                new Butterfly(),
	                new Cat()
	        };
	        AnimalCountHelper animalCount = new AnimalCountHelper(animals);

	        assertEquals(animalCount.getFlyCount(), 5);
	        assertEquals(animalCount.getWalkCount(), 8);
	        assertEquals(animalCount.getSpeakCount(), 7);
	        assertEquals(animalCount.getSwimCount(), 5);


	}
}
