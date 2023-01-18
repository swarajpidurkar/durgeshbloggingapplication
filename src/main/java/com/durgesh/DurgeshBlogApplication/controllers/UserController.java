package com.durgesh.DurgeshBlogApplication.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgesh.DurgeshBlogApplication.payload.ApiResponse;
import com.durgesh.DurgeshBlogApplication.payload.UserDto;
import com.durgesh.DurgeshBlogApplication.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	//POST- create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
		UserDto createUser = this.userService.createUser(userDto);
		
		return new ResponseEntity<>(createUser,HttpStatus.CREATED);
		
	}
	
	// PUT update user
	
	
	// PUT- update user

		@PutMapping("/{userId}")
		public ResponseEntity<UserDto> updateUser( @RequestBody UserDto userDto, @PathVariable("userId") Integer uid) {
			UserDto updatedUser = this.userService.updateUser(userDto, uid);
			return ResponseEntity.ok(updatedUser);
		}
	// DELETE -delete user
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteuser(@PathVariable("userId") Integer userId){
		this.userService.deleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("user deleted Succeasgully",true),HttpStatus.OK);
		
	}
	
	// get user get
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAlluser(){
		
		return ResponseEntity.ok(this.userService.getAllUsers());
		
		
	}
	// get user id
	
	// GET - user get
		@GetMapping("/{userId}")
		public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId) {
			return ResponseEntity.ok(this.userService.getUserById(userId));
		}

	

}
