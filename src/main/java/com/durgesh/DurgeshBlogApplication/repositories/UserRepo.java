package com.durgesh.DurgeshBlogApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgesh.DurgeshBlogApplication.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
