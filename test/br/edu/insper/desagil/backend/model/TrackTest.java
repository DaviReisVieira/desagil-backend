package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	void testOneCollaborator() {
		List<Artist> collaborators = new ArrayList<>();
		Artist collaborator = new Artist("Becky G");
		
		collaborators.add(collaborator);
		
		Track track = new CollaborationTrack(artist, collaborators, name, 145);
		
		
		assertEquals("Anitta (feat. Becky G)", track.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		List<Artist> collaborators = new ArrayList<>();
		Artist collaborator1 = new Artist("Ludmilla");
		Artist collaborator2 = new Artist("Snoop Dog");
		
		collaborators.add(collaborator1);
		collaborators.add(collaborator2);
		
		Track track = new CollaborationTrack(artist, collaborators, name, 145);
		
		
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", track.getFullArtistName());
	}
}
