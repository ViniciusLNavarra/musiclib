package ch.vinicius.musiclibrary.musiclib.role;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import ch.vinicius.musiclibrary.musiclib.model.User;

@Entity(name = "role")
public class Roles {
	@Id
	@GeneratedValue
	Long roleId;
	@Column(name = "role")
	String role;
	private List<User> users;

	@ManyToMany
	@JoinColumn(name = "user", nullable = false)
	public List<User> getUsers() {
		return users;
	}
}
