package ch.vinicius.musiclibrary.musiclib.dto;

import ch.vinicius.musiclibrary.musiclib.model.User;

public class UserDto {

	private String username;
	private String password;

	public UserDto(User user) {
		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
