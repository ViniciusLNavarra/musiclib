package ch.vinicius.musiclibrary.musiclib.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;
import ch.vinicius.musiclibrary.musiclib.exception.InvalidArgumentException;
import ch.vinicius.musiclibrary.musiclib.exception.UserNotFoundException;
import ch.vinicius.musiclibrary.musiclib.model.User;
import ch.vinicius.musiclibrary.musiclib.repository.Repository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	Repository repos;

	@Override
	public List<User> getAllUsers() {
		return StreamSupport.stream(repos.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public User getUserByUsername(String username) {
		return repos.findByUsername(username).orElseThrow(UserNotFoundException::new);
	}

	@Override
	public User getUserById(Long userId) {
		return repos.findById(userId).orElseThrow(UserNotFoundException::new);
	}

	@Override
	public User updateUserById(Long userId, UserInputDto userInputDto) {
		if (userId == null) {
			throw new InvalidArgumentException();
		}
		User user = getUserById(userId);
		return repos.updateUser(user);
	}

	@Override
	public void deleteUserById(Long userId) {
		if (userId != null) {
			repos.deleteById(userId);
		}
	}

}
