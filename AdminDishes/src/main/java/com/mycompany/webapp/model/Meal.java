/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */

package com.mycompany.webapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
@Table(name = "meal")
public class Meal extends BaseObject {

	private Long mealID;
	private String nameMeal;
	private String picture;
	private String descriptionMeal;
	private Integer stateMeal;
	private Set<MealSubscription> mealSubscription;
	/*
	 * Faltan varibles de relacion
	 * 
	 */

	// START SNIPPET: mealID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mealID", unique = true, nullable = false)
	public Long getMealID() {
		return mealID;
	}
	// END SNIPET: mealID
	
	public void setMealID(Long mealID) {
		this.mealID = mealID;
	}

	@Column(name = "nameMeal", length = 500)
	public String getNameMeal() {
		return nameMeal;
	}
	public void setNameMeal(String nameMeal) {
		this.nameMeal = nameMeal;
	}

	@Column(name = "picture", length = 1000)
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "descriptionMeal", length = 500)
	public String getDescriptionMeal() {
		return descriptionMeal;
	}
	public void setDescriptionMeal(String descriptionMeal) {
		this.descriptionMeal = descriptionMeal;
	}
	

	@Column(name = "stateMeal")
	public Integer getStateMeal() {
		return stateMeal;
	}

	public void setStateMeal(Integer stateMeal) {
		this.stateMeal = stateMeal;
	}

	
	@OneToMany(mappedBy = "meal",fetch = FetchType.LAZY)
	@JsonIgnore
	@XmlTransient
	public Set<MealSubscription> getMealSubscription() {
		return mealSubscription;
	}	
	public void setMealSubscription(Set<MealSubscription> mealSubscription) {
		this.mealSubscription = mealSubscription;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descriptionMeal == null) ? 0 : descriptionMeal.hashCode());
		result = prime * result + ((mealID == null) ? 0 : mealID.hashCode());
		result = prime * result + ((nameMeal == null) ? 0 : nameMeal.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + ((stateMeal == null) ? 0 : stateMeal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meal other = (Meal) obj;
		if (descriptionMeal == null) {
			if (other.descriptionMeal != null)
				return false;
		} else if (!descriptionMeal.equals(other.descriptionMeal))
			return false;
		if (mealID == null) {
			if (other.mealID != null)
				return false;
		} else if (!mealID.equals(other.mealID))
			return false;
		if (nameMeal == null) {
			if (other.nameMeal != null)
				return false;
		} else if (!nameMeal.equals(other.nameMeal))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (stateMeal == null) {
			if (other.stateMeal != null)
				return false;
		} else if (!stateMeal.equals(other.stateMeal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Meal [mealID=" + mealID + ", nameMeal=" + nameMeal + ", picture=" + picture + ", descriptionMeal="
				+ descriptionMeal + ", stateMeal=" + stateMeal + "]";
	}
}
