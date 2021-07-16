package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "music")
public class Music {
	@Id
	@GeneratedValue
	Long musicId;
	@ManyToMany(mappedBy = "musiclist")
	private List<LibraryImpl> libraries;
	@ManyToOne
	private Artist artist;
	@Column(name = "name")
	private String musicname;

	public List<LibraryImpl> getLibraries() {
		return libraries;
	}

	public Artist getArtist() {
		return artist;
	}
}
