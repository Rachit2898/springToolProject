package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class asset {
	
	@Id
	private long id;
	private String categoryName;
	private String categoryType;
	private String description;
	
	public asset(long id, String categoryName,String categoryType, String description) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		
		this.description = description;
	}
	public asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getcategoryName() {
		return categoryName;
	}
	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getcategoryType() {
		return categoryType;
	}
	public void setcategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", categoryName=" + categoryName + ",categoryType=" + categoryType + ", description=" + description + "]";
	}

}
