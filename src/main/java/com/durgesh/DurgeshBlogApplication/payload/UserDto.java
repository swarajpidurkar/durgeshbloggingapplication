package com.durgesh.DurgeshBlogApplication.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto {

	
	private int id;
	
	@NotEmpty
	@Size(min=4,message="usernmae must be min of 4 character")
	private String name;
	
	
	@Email(message="Email Address is not valid ")
	private String email;
	
	@NotEmpty
	private String passoword;
	
	@NotEmpty
	@Size(min=3,max=10,message ="password must be min of 3 chars and maximum 10 chars")
	
	private String about;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassoword() {
		return passoword;
	}
	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
