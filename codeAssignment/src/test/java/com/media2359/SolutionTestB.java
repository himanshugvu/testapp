package com.media2359;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.media2359.model.Clownfish;
import com.media2359.model.Dolphin;
import com.media2359.model.Fish;
import com.media2359.model.Shark;

public class SolutionTestB {
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
	void canFishSingh() {
		 new Fish().callSound();
		assertEquals("",outContent.toString());
	}
	
	@Test
	void canFishWalk() {
		 new Fish().canWalk();
		assertEquals("Can Not Walk",outContent.toString());
	}
	
	@Test
	void canFishSwim() {
		 new Fish().canSwim();
		assertEquals("Can Swim",outContent.toString());
	}
	
	@Test
	void testSharkSize() {
		 new Shark().bodySize();
		assertEquals("Large",outContent.toString());
	}
	
	@Test
	void testSharkColor() {
		 new Shark().bodyColor();
		assertEquals("Grey",outContent.toString());
	}
	
	@Test
	void testClownFishSize() {
		 new Clownfish().bodySize();
		assertEquals("Small",outContent.toString());
	}
	
	@Test
	void testClownFishColor() {
		 new Clownfish().bodyColor();
		assertEquals("Orange",outContent.toString());
	}
	
	@Test
	void testClownFishHumour() {
		  new Clownfish().makeJoke();
		assertEquals("Make Jokes",outContent.toString());
	}
	
	@Test
	void testSharkEat() {
		  new Shark().canEat();
		assertEquals("Eat Fish",outContent.toString());
	}
	
	@Test
	void canDolphinSwim() {
		 new Dolphin().canSwim();
		assertEquals("Can Swim",outContent.toString());
	}
}
