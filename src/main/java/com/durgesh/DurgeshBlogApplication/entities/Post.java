package com.durgesh.DurgeshBlogApplication.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="post")
public class Post {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postId;
	
	@Column(name="post_title",length=100,nullable = false)
	private String title;
	
	
	@Column(length=1000)
	private String content;
	
	private String imagename;
	
	private Date addedDate;
	
	
	@ManyToOne
	
	private Category category;
	
	

	@ManyToOne
	private User user;



	public Integer getPostId() {
		return postId;
	}



	public void setPostId(Integer postId) {
		this.postId = postId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getImagename() {
		return imagename;
	}



	public void setImagename(String imagename) {
		this.imagename = imagename;
	}



	public Date getAddedDate() {
		return addedDate;
	}



	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	

}
