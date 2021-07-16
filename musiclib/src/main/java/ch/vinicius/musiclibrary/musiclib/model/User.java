package ch.vinicius.musiclibrary.musiclib.model;

import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;

public interface User {

	String getUsername();

	String getPassword();

	void update(UserInputDto userInputDto);

}
