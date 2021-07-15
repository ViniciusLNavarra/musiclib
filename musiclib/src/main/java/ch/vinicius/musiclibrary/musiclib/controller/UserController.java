package ch.vinicius.musiclibrary.musiclib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.vinicius.musiclibrary.musiclib.dto.LibraryDto;
import ch.vinicius.musiclibrary.musiclib.dto.UserDto;
import ch.vinicius.musiclibrary.musiclib.dto.UserInputDto;
import ch.vinicius.musiclibrary.musiclib.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("list")
	List<LibraryDto> getAllLibraries() {
		return null;
	}

	@PostMapping("{username}")
	UserDto getUser(@PathVariable String username, @RequestBody UserInputDto userInputDto) {
		System.out.print(username);
		return new UserDto(service.getUserByUsername(userInputDto.getUsername()));
	}
}
