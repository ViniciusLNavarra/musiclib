package ch.vinicius.musiclibrary.musiclib.service;

import java.util.List;

import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;
import ch.vinicius.musiclibrary.musiclib.model.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserByUsername(String username);

	User updateUserById(Long userId, UserInputDto userInputDto);

	User getUserById(Long userId);

	void deleteUserById(Long userId);

}
