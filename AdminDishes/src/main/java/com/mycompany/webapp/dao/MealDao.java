/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *interface: dao of meal of de the table meal
 */


package com.mycompany.webapp.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.mycompany.webapp.model.Meal;


public interface MealDao extends GenericDao<Meal, Long> {
	
	public List<Meal> findByName(String nameMeal);
	
}
