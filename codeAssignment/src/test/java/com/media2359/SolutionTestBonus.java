package com.media2359;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.media2359.helper.LanguageEnums;
import com.media2359.model.Rooster;

public class SolutionTestBonus {
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
	void testRoosterSoundInDanish() {
		new Rooster(LanguageEnums.DANISH).callSound();
		assertEquals("kykyliky", outContent.toString());
	}

	@Test
	void testRoosterSoundInDutch() {
		new Rooster(LanguageEnums.DUTCH).callSound();
		assertEquals("kukeleku", outContent.toString());
	}

	@Test
	void testRoosterSoundInFinnish() {
		new Rooster(LanguageEnums.FINNISH).callSound();
		assertEquals("kukko kiekuu", outContent.toString());
	}

	@Test
	void testRoosterSoundInFrench() {
		new Rooster(LanguageEnums.FRENCH).callSound();
		assertEquals("cocorico", outContent.toString());
	}

	@Test
	void testRoosterSoundInGerman() {
		new Rooster(LanguageEnums.GERMAN).callSound();
		assertEquals("kikeriki", outContent.toString());
	}

	@Test
	void testRoosterSoundInGreek() {
		new Rooster(LanguageEnums.GREEK).callSound();
		assertEquals("kikiriki", outContent.toString());
	}

	@Test
	void testRoosterSoundInHebrew() {
		new Rooster(LanguageEnums.HEBREW).callSound();
		assertEquals("coo-koo-ri-koo", outContent.toString());
	}

	@Test
	void testRoosterSoundInHungarian() {
		new Rooster(LanguageEnums.HUNGARIAN).callSound();
		assertEquals("kukuriku", outContent.toString());
	}

	@Test
	void testRoosterSoundInItalian() {
		new Rooster(LanguageEnums.ITALIAN).callSound();
		assertEquals("chicchirichi", outContent.toString());
	}

	@Test
	void testRoosterSoundInJapanese() {
		new Rooster(LanguageEnums.JAPANESE).callSound();
		assertEquals("ko-ke-kok-ko-o", outContent.toString());
	}

	@Test
	void testRoosterSoundInPortuguese() {
		new Rooster(LanguageEnums.PORTUGUESE).callSound();
		assertEquals("cucurucu", outContent.toString());
	}

	@Test
	void testRoosterSoundInRussian() {
		new Rooster(LanguageEnums.RUSSIAN).callSound();
		assertEquals("kukareku", outContent.toString());
	}

	@Test
	void testRoosterSoundInSwedish() {
		new Rooster(LanguageEnums.SWEDISH).callSound();
		assertEquals("kuckeliku", outContent.toString());
	}

	@Test
	void testRoosterSoundInTurkish() {
		new Rooster(LanguageEnums.TURKISH).callSound();
		assertEquals("kuk-kurri-kuuu", outContent.toString());
	}

	@Test
	void testRoosterSoundInUrdu() {
		new Rooster(LanguageEnums.URDU).callSound();
		assertEquals("kuklooku", outContent.toString());
	}

}
