package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		String artistName = this.getArtist().getName();
		List<String> collaboratorsListName = new ArrayList<>();
		
		for (Artist collaborator: collaborators) {
			String collaboratorName = collaborator.getName();
			collaboratorsListName.add(collaboratorName);
		}
		
		return artistName + " (feat. "+String.join(", ", collaboratorsListName)+")";
	}

}
