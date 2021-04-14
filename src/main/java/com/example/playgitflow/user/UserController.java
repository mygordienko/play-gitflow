package com.example.playgitflow.user;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
public class UserController {
	public Collection<UserDto> getUsers() {
		return Collections.emptyList();
	}
}
