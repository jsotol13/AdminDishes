/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */

package com.mycompany.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name = "MealSubscription")
@Entity
@Table(name = "mealSubscription")
public class MealSubscription extends BaseObject {
	
	private Long mealSubscriptionID;
	private int dayMealSubscription;
	private Meal meal;
	private Subscription subscription;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mealSubscriptionID", unique = true, nullable = false)
	public Long getMealSubscriptionID() {
		return mealSubscriptionID;
	}
	public void setMealSubscriptionID(Long mealSubscription) {
		this.mealSubscriptionID = mealSubscription;
	}
	
	
	@Column(name = "dayMealSubscription")
	public int getDayMealSubscription() {
		return dayMealSubscription;
	}
	public void setDayMealSubscription(int dayMealSubscription) {
		this.dayMealSubscription = dayMealSubscription;
	}

	
	@ManyToOne
	@JoinColumn(name = "mealID", nullable = false)
	@JsonIgnore	
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	
	@ManyToOne
	@JoinColumn(name = "subscriptionID")
	@JsonIgnore
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayMealSubscription;
		result = prime * result + ((meal == null) ? 0 : meal.hashCode());
		result = prime * result + ((subscription == null) ? 0 : subscription.hashCode());
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
		MealSubscription other = (MealSubscription) obj;
		if (dayMealSubscription != other.dayMealSubscription)
			return false;
		if (meal == null) {
			if (other.meal != null)
				return false;
		} else if (!meal.equals(other.meal))
			return false;
		if (subscription == null) {
			if (other.subscription != null)
				return false;
		} else if (!subscription.equals(other.subscription))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MealSubscription [dayMealSubscription=" + dayMealSubscription + ", meal=" + meal + ", subscription="
				+ subscription + "]";
	}

}
