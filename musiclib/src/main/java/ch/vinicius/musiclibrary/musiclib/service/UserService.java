package ch.vinicius.musiclibrary.musiclib.service;

import java.util.List;

import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;
import ch.vinicius.musiclibrary.musiclib.model.Library;
import ch.vinicius.musiclibrary.musiclib.model.User;

// Is used for all user requests.
public interface UserService {

	List<User> getAllUsers();

	User getUserByUsername(String username);

	User updateUserById(Long userId, UserInputDto userInputDto);

	User getUserById(Long userId);

	void deleteUserById(Long userId);

	List<Library> getLibraries(String username);

}
