package ch.vinicius.musiclibrary.musiclib.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ch.vinicius.musiclibrary.musiclib.model.Library;
import ch.vinicius.musiclibrary.musiclib.model.User;
import ch.vinicius.musiclibrary.musiclib.model.UserImpl;

public interface Repository extends CrudRepository<UserImpl, Long> {

	default User updateUser(User user) {
		return save((UserImpl) user).getUser();
	}

	Optional<User> findByUsername(String username);

	default User saveUser(String username, String password) {
		return save(new UserImpl(username, password));
	}

	List<Library> findLibraryByUsername(String username);
}
