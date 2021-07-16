package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "library")
public class LibraryImpl implements Library {

	@Id
	@GeneratedValue
	Long libraryId;
	@Column(name = "name")
	String name;
	private final User user;
	List<Music> musiclist;

	@Override
	@ManyToMany
	@JoinTable(name = "library_music")
	public List<Music> getMusiclist() {
		return musiclist;
	}

	public LibraryImpl(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "user", nullable = false)
	public User getUser() {
		return user;
	}

	@Override
	public String getName() {
		return name;
	}
}
