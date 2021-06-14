package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;

	@BeforeEach
	void setUp() {
	}

	@Test
	void testRoundDownToZero() {
		Playlist playlist = new Playlist(12);
		
		playlist.putRating("Junhinho Sales", 1);
		playlist.putRating("Nelson Oliveira", 2);
		playlist.putRating("Cajubá Ordones", 3);
		playlist.putRating("Delsia Lauren", 3);
		
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		Playlist playlist = new Playlist(10);
		
		playlist.putRating("Cabral Sales", 1);
		playlist.putRating("Alex Oliveira", 2);
		playlist.putRating("Cajubá Malvin", 1);
		
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		Playlist playlist = new Playlist(14);
		
		playlist.putRating("João Orta", 1);
		playlist.putRating("Nelson Reiz", 2);
		playlist.putRating("Talzeu Ordones", 2);
		
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToOne() {
		Playlist playlist = new Playlist(21);
		
		playlist.putRating("Zeus Sales", 1);
		playlist.putRating("Nelson Mandalo", 1);
		playlist.putRating("Steve Nelson", 2);
		playlist.putRating("Bill Musk", 3);
		
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}
}
