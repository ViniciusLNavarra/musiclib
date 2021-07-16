package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;

public interface User {

	String getUsername();

	String getPassword();

	void update(UserInputDto userInputDto);

	Long getId();

	List<LibraryImpl> getLibraries();

}
