package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "artist")
public class Artist {
	@Id
	@GeneratedValue
	Long artistId;
	@Column(name = "name")
	String artistname;
	@OneToMany(mappedBy = "artist")
	private List<Music> musiclist;

	public List<Music> getMusic() {
		return musiclist;
	}
}
