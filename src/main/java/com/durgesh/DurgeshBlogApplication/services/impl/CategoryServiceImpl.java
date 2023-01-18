package com.durgesh.DurgeshBlogApplication.services.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgesh.DurgeshBlogApplication.entities.Category;
import com.durgesh.DurgeshBlogApplication.entities.User;
import com.durgesh.DurgeshBlogApplication.exception.ResourceNotFoundException;
import com.durgesh.DurgeshBlogApplication.payload.CategoryDto;
import com.durgesh.DurgeshBlogApplication.payload.UserDto;
import com.durgesh.DurgeshBlogApplication.repositories.CategoryRepo;
import com.durgesh.DurgeshBlogApplication.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat = this.modelMapper.map(categoryDto, Category.class);
		Category addedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}


	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","Category Id", categoryId));
		
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		
		cat.setCategoryDescription(categoryDto.getCategoryDiscription());
		
		Category updatedcat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(updatedcat, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","Category Id", categoryId));
 
		this.categoryRepo.delete(cat); 
		
		
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","Category Id", categoryId));

		
		
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		
		List<Category> categories = this.categoryRepo.findAll();
		
		List<CategoryDto> catDtos = categories.stream().map((cat) -> this.modelMapper.map(cat, CategoryDto.class))
				.collect(Collectors.toList());		
		return catDtos;
	}
private Category dtoToCategory(CategoryDto categoryDto) {
		
		 Category category = this.modelMapper.map(categoryDto, Category.class);
		return category;
	}


	private CategoryDto categoryToDto(Category category) {
		CategoryDto categoryDto = this.modelMapper.map(category,CategoryDto.class);
		return categoryDto;
	}

}
