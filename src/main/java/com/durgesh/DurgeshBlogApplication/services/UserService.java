package com.durgesh.DurgeshBlogApplication.services;


import java.util.List;

import com.durgesh.DurgeshBlogApplication.payload.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();
    
    void deleteUser(Integer userId);
}
