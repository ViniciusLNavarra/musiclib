package ch.vinicius.musiclibrary.musiclib.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.vinicius.musiclibrary.musiclib.dto.LibraryDto;
import ch.vinicius.musiclibrary.musiclib.dto.UserDto;
import ch.vinicius.musiclibrary.musiclib.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("{username}/libraries")
	List<LibraryDto> getAllLibraries(@PathVariable String username) {
		return service.getLibraries(username).stream().map(library -> new LibraryDto(library))
				.collect(Collectors.toList());
	}

	@GetMapping("{username}")
	UserDto getUser(@PathVariable String username) {
		return new UserDto(service.getUserByUsername(username));
	}
}
