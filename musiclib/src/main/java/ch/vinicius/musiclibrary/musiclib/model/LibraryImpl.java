package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "library")
public class LibraryImpl implements Library {

	@Id
	@GeneratedValue
	Long libraryId;
	@Column(name = "name")
	String name;
	@ManyToOne
	private final UserImpl user;

	@ManyToMany
	List<Music> musiclist;

	@Override
	public List<Music> getMusiclist() {
		return musiclist;
	}

	public LibraryImpl(UserImpl user) {
		this.user = user;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public String getName() {
		return name;
	}
}
