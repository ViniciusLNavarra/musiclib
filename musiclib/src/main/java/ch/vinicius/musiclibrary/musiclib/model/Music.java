package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "music")
public class Music {
	@Id
	@GeneratedValue
	Long musicId;
	private List<Library> libraries;
	private Artist artist;
	@Column(name = "name")
	private String musicname;

	@ManyToMany
	public List<Library> getLibraries() {
		return libraries;
	}

	@ManyToOne
	@JoinColumn(name = "artist", nullable = false)
	public Artist getArtist() {
		return artist;
	}
}
