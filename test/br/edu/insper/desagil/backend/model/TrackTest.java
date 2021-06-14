package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist artist;
	private String name = "Aldacir Coelho";
	
	@BeforeEach
	void setUp() {
		artist = new Artist("Anitta");
	}

	@Test
	void testZeroSeconds() {
		Track track = new Track(artist, name, 0);
		
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Track track = new Track(artist, name, 5);
		
		assertEquals("0:05", track.getDurationString());	
	}

	@Test
	void testTwentyFiveSeconds() {
		Track track = new Track(artist, name, 25);
		
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Track track = new Track(artist, name, 60);
		
		assertEquals("1:00", track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Track track = new Track(artist, name, 65);
		
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Track track = new Track(artist, name, 85);
		
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Track track = new Track(artist, name, 120);
		
		assertEquals("2:00", track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Track track = new Track(artist, name, 125);
		
		assertEquals("2:05", track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Track track = new Track(artist, name, 145);
		
		assertEquals("2:25", track.getDurationString());
	}
}
