package com.mycompany.webapp.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="meal")
public class MealDTO {
	private Long mealID ;
	private String nameMeal;
	private String  picture;
	private String descriptionMeal ;
	private Integer stateMeal;
	/*
	 * Faltan varibles de relacion
	 * 
	 * */
	public MealDTO(Long mealID, String nameMeal, String picture, String descriptionMeal, Integer stateMeal) {
		super();
		this.mealID = mealID;
		this.nameMeal = nameMeal;
		this.picture = picture;
		this.descriptionMeal = descriptionMeal;
		this.stateMeal = stateMeal;
	}
	
	public MealDTO() {
		super();
		}

	public Long getMealID() {
		return mealID;
	}

	public void setMealID(Long mealID) {
		mealID = mealID;
	}

	public String getNameMeal() {
		return nameMeal;
	}

	public void setNameMeal(String nameMeal) {
		nameMeal = nameMeal;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		picture = picture;
	}

	public String getDescriptionMeal() {
		return descriptionMeal;
	}

	public void setDescriptionMeal(String descriptionMeal) {
		descriptionMeal = descriptionMeal;
	}

	public Integer getStateMeal() {
		return stateMeal;
	}

	public void setStateMeal(Integer stateMeal) {
		stateMeal = stateMeal;
	}
	

}
