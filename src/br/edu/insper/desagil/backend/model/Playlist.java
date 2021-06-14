package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public int getId() {
		return this.id;
	}

	public List<Track> getTracks() {
		return this.tracks;
	}

	public Map<String, Integer> getRatings() {
		return this.ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String userName, Integer rate) {
		this.ratings.put(userName, rate);			
	}
	
	public Double averageRatings() {
		double totalRatingsValue = 0;
		int totalRatings = this.ratings.size();

		for (Integer rate: this.ratings.values()) {
			totalRatingsValue+=rate;
		}
		
		double ratingAverage = totalRatingsValue / totalRatings;
		int integerAverage = (int) ratingAverage;
		double fractionalAverage = ratingAverage - integerAverage;
		double semiRoundedFractionalAverage = 0.0;
		
		if (fractionalAverage<0.26) {
			semiRoundedFractionalAverage = 0.0;
		} else if ((fractionalAverage>=0.26) && (fractionalAverage<0.74)) {
			semiRoundedFractionalAverage = 0.5;
		} else {
			semiRoundedFractionalAverage = 1.0;
		}
		
		return integerAverage + semiRoundedFractionalAverage;
		
	}
	
	
	
	

}
