package com.media2359;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.media2359.enums.BirdSoundEnums;
import com.media2359.helper.BirdSoundHelper;
import com.media2359.model.Bird;
import com.media2359.model.Chicken;
import com.media2359.model.Duck;
import com.media2359.model.Parrot;
import com.media2359.model.Rooster;

public class SolutionTestA {
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
	void birdCanWalk() {
		new Bird().canWalk();
		assertEquals("Can Walk",outContent.toString());
	}
	
	@Test
	void canChickenWalk() {
		new Chicken().canWalk();
		assertEquals("Can Walk",outContent.toString());
	}
	
	@Test
	void canDucknWalk() {
		new Duck().canWalk();
		assertEquals("Can Walk",outContent.toString());
	}
	
	@Test
	void canRoosterWalk() {
		new Rooster().canWalk();
		assertEquals("Can Walk",outContent.toString());
	}
	
	@Test
	void testBirdSing() {
		 new Bird().callSound();
		assertEquals("Singing",outContent.toString());
	}
	
	@Test
	void testDuckSound() {
		 new Duck().callSound();
		assertEquals("Quack, quack",outContent.toString());
	}
	
	@Test
	void canDuckSwim() {
		 new Duck().canSwim();
		assertEquals("Can Swim",outContent.toString());
	}
	
	@Test
	void testChickenSound() {
		 new Chicken().callSound();
		assertEquals("Cluck, cluck",outContent.toString());
	}
	
	@Test
	void canChickenFly() {
		 new Chicken().canFly();
		assertEquals("Can not Fly",outContent.toString());
	}
	
	@Test
	void testRoosterSound() {
		 new Rooster().callSound();
		assertEquals("Cock-a-doodle-doo",outContent.toString());
	}
	
	@Test
	void testParrotSoundWithDogs() {
		new Parrot(new BirdSoundHelper(BirdSoundEnums.DOG)).callSound();
		assertEquals("Woof, woof",outContent.toString());
	}
	
	@Test
	void testParrotSoundWithCats() {
		new Parrot(new BirdSoundHelper(BirdSoundEnums.CAT)).callSound();
		assertEquals("Meow",outContent.toString());
	}
	
	@Test
	void testParrotSoundWithRooster() {
		new Parrot(new BirdSoundHelper(BirdSoundEnums.ROOSTER)).callSound();
		assertEquals("Cock-a-doodle-doo",outContent.toString());
	}
}
