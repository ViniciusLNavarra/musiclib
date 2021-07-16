package ch.vinicius.musiclibrary.musiclib.role;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import ch.vinicius.musiclibrary.musiclib.model.UserImpl;

@Entity(name = "role")
public class Roles {
	@Id
	@GeneratedValue
	Long roleId;
	@Column(name = "role")
	String rolename;
	@ManyToMany(mappedBy = "roles")
	private List<UserImpl> users;

	public List<UserImpl> getUsers() {
		return users;
	}
}
