package com.gabriel.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>>  findAll(){
		User maria = new User("1", "maria silva", "maria@gmail.com");
		User leticia = new User("2", "leticia daniela", "leticia@gmail.com");
		User jorge = new User("3", "jorge bento", "jorge@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, leticia,jorge));
		return ResponseEntity.ok().body(list);
	}

}
