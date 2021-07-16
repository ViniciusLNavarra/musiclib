package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Artist {
	@Id
	@GeneratedValue
	Long artistId;
	@Column(name = "name")
	String artistname;
	private List<Music> musiclist;

	@OneToMany(mappedBy = "artist")
	public List<Music> getMusic() {
		return musiclist;
	}
}
