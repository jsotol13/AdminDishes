/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: DaoHibernate of meal of de the table meal
 */



package com.mycompany.webapp.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.mycompany.webapp.dao.MealDao;
import com.mycompany.webapp.model.Meal;

@Repository("mealdao")
public class MealDaoHibernate extends GenericDaoHibernate<Meal, Long> implements MealDao{

	public MealDaoHibernate( ) {
		super(Meal.class);
		// TODO Auto-generated constructor stub
	}

	public List<Meal> findByName(String nameMeal) {
		return getSession().createCriteria(Meal.class).add(Restrictions.eq("nameMeal", nameMeal)).list();
	}
	
}
