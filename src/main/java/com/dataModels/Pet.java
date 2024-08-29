package com.dataModels;

import java.io.InputStream;

public class Pet {
	private String petName;
	private String petType;
	private String petGender;
	private String petDesc;
	private Integer petPrice;
	private InputStream petImage;
	public InputStream getPetImage() {
		return petImage;
	}
	public void setPetImage(InputStream petImage) {
		this.petImage = petImage;
	}
	private String email;
	public Pet() {
		
	}
	public Pet(String petName, String petType, String petGender, String petDesc, Integer petPrice, String email) {
		super();
		this.petName = petName;
		this.petType = petType;
		this.petGender = petGender;
		this.petDesc = petDesc;
		this.petPrice = petPrice;
		this.email = email;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	public String getPetDesc() {
		return petDesc;
	}
	public void setPetDesc(String petDesc) {
		this.petDesc = petDesc;
	}
	public Integer getPetPrice() {
		return petPrice;
	}
	public void setPetPrice(Integer petPrice) {
		this.petPrice = petPrice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
