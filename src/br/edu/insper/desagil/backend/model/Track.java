package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public String getName() {
		return this.name;
	}

	public int getDuration() {
		return this.duration;
	}
	
	public String getDurationString() {
		int minutes = this.duration/60;
		int secondsLeft = this.duration - minutes*60;
		String formatedDuration = String.format("%d:%02d", minutes,secondsLeft);
		return formatedDuration; 	
	}
	
	public String getFullArtistName() {
		return this.getArtist().getName();
	}
}

