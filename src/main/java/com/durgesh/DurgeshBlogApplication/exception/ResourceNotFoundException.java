package com.durgesh.DurgeshBlogApplication.exception;

public class ResourceNotFoundException extends RuntimeException{

	String resourceName;
	String resourceFieldName;
	long fieldValue;
	
	
	public String getResourceName() {
		return resourceName;
	}


	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}


	public String getResourceFieldName() {
		return resourceFieldName;
	}


	public void setResourceFieldName(String resourceFieldName) {
		this.resourceFieldName = resourceFieldName;
	}


	public long getFieldValue() {
		return fieldValue;
	}


	public void setFieldValue(long fieldValue) {
		this.fieldValue = fieldValue;
	}


	public ResourceNotFoundException(String resourceName, String resourceFieldName, long fieldValue) {
		super(String.format("%s not found with this %s :%s ", resourceName,resourceFieldName,fieldValue));
		this.resourceName = resourceName;
		this.resourceFieldName = resourceFieldName;
		this.fieldValue = fieldValue;
	}
	
	
}
