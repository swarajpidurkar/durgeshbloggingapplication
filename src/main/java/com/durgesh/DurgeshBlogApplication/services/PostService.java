package com.durgesh.DurgeshBlogApplication.services;

import java.util.List;

import com.durgesh.DurgeshBlogApplication.entities.Post;
import com.durgesh.DurgeshBlogApplication.payload.PostDto;
import com.durgesh.DurgeshBlogApplication.payload.PostResponse;

public interface PostService {
	
	// create
	
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	
	// get all post
	PostResponse getallPost(Integer pageNumber,Integer pagesize,String sortBy);
	
	
	// get post by Id
	PostDto getPostById(Integer postId);
	
	// get all post by category
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	// get all post by user
	
	List<PostDto> getPostByUser(Integer userId); 
	

	// search posts
	
	List<Post> serachPosts(String Keyword);
}
