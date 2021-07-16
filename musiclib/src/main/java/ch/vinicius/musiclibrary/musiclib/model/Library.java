package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

// Used to create Libraries to hold Music
public interface Library {
	public String getName();

	public List<Music> getMusiclist();

	User getUser();
}
