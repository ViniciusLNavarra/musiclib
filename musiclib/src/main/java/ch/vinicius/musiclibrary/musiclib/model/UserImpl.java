package ch.vinicius.musiclibrary.musiclib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "User")
public class UserImpl implements User {

	@Id
	@GeneratedValue
	private Long userId;
	@Column(unique = true)
	private String username;
	private String passwordHash;

	public UserImpl() {
	}

	public UserImpl(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return passwordHash;
	}

	public void setPassword(String password) {
		this.passwordHash = password;
	}

	public User getUser() {
		return this;
	}

}
