package com.durgesh.DurgeshBlogApplication.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgesh.DurgeshBlogApplication.entities.Category;
import com.durgesh.DurgeshBlogApplication.entities.Post;
import com.durgesh.DurgeshBlogApplication.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	
	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
	

}
