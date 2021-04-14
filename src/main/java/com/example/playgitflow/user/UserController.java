package com.example.playgitflow.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping
	public Collection<UserDto> getUsers() {
		final UserDto tom = new UserDto(1L, "Tom");
		return List.of(tom);
	}
}
