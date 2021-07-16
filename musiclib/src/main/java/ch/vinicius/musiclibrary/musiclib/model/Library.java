package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

public interface Library {
	public String getName();

	public List<Music> getMusiclist();

	User getUser();
}
