package com.durgesh.DurgeshBlogApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgesh.DurgeshBlogApplication.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
