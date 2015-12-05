/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */


package com.mycompany.webapp.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.webapp.model.Meal;

public class MealDaoTest extends BaseDaoTestCase {
	@Autowired
	MealDao mealDao;
	
	  @Test
	    public void testFindPersonByFirstName() throws Exception {
	        List<Meal> meals = mealDao.findByName("Rice");
	        assertTrue(meals.size() > 0);
	    }
	
}
