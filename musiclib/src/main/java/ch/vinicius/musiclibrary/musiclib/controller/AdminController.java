package ch.vinicius.musiclibrary.musiclib.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.vinicius.musiclibrary.musiclib.dto.UserDto;
import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;
import ch.vinicius.musiclibrary.musiclib.exception.InvalidArgumentException;
import ch.vinicius.musiclibrary.musiclib.service.UserService;

@RestController
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private UserService service;

	@GetMapping("list")
	List<UserDto> getAllUsers() {
		return service.getAllUsers().stream().map(user -> new UserDto(user)).collect(Collectors.toList());
	}

	@PostMapping("user/{id}")
	UserDto updateUser(@PathVariable String id, @RequestBody UserInputDto userInputDto) {
		try {
			Long userId = Long.parseLong(id);
			return new UserDto(service.updateUserById(userId, userInputDto));
		} catch (NumberFormatException ex) {
			throw new InvalidArgumentException();
		}
	}

	@DeleteMapping("user/{id}")
	void deleteUser(@PathVariable String id) {
		try {
			Long userId = Long.parseLong(id);
			service.deleteUserById(userId);
		} catch (NumberFormatException ex) {
			throw new InvalidArgumentException();
		}
	}
}
