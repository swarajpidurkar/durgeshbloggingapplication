package com.durgesh.DurgeshBlogApplication.payload;
 

public class CategoryDto {
	
	private Integer categoryId;
	
	private String categoryTitle;
	
	private String categoryDiscription;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDiscription() {
		return categoryDiscription;
	}

	public void setCategoryDiscription(String categoryDiscription) {
		this.categoryDiscription = categoryDiscription;
	}

	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
