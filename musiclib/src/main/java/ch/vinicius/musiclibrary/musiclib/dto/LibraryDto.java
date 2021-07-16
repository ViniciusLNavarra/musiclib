package ch.vinicius.musiclibrary.musiclib.dto;

import ch.vinicius.musiclibrary.musiclib.model.Library;

public class LibraryDto {
	private String name;
	private Object musiclist;

	public LibraryDto(Library library) {
		this.name = library.getName();
		this.musiclist = library.getMusiclist();
	}
}
