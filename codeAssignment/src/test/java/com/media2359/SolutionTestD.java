package com.media2359;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.media2359.model.Caterpillar;

public class SolutionTestD {
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
	void canCaterpillarFly() {
		 new Caterpillar().canFly();
		assertEquals("Can not Fly",outContent.toString());
	}
	
	@Test
	void canCaterpillarWalk() {
		 new Caterpillar().canWalk();
		assertEquals("Can Walk",outContent.toString());
	}
	
	@Test
	void canButterflyFly() {
		 new Caterpillar().transformToButterfly().canFly();
		assertEquals("Can Fly",outContent.toString());
	}
	
	@Test
	void canButterflySpeak() {
		 new Caterpillar().transformToButterfly().callSound();
		assertEquals("",outContent.toString());
	}
}
