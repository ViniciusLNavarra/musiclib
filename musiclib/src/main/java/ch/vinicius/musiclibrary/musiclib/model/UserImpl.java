package ch.vinicius.musiclibrary.musiclib.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;
import ch.vinicius.musiclibrary.musiclib.role.Roles;

@Entity(name = "User")
public class UserImpl implements User {

	@Id
	@GeneratedValue
	private Long userId;
	@Column(name = "username", unique = true)
	private String username;
	@Column(name = "password")
	private String passwordHash;
	@OneToMany(mappedBy = "user")
	private List<LibraryImpl> libraries;
	@ManyToMany
	private List<Roles> roles;

	@Override
	public List<LibraryImpl> getLibraries() {
		return libraries;
	}

	@JoinTable(name = "user_role")
	public List<Roles> getRoles() {
		return roles;
	}

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

	@Override
	public void update(UserInputDto userInputDto) {
		this.setUsername(userInputDto.getUsername());
		this.setPassword(userInputDto.getPassword());
	}

	@Override
	public Long getId() {
		return userId;
	}

}
