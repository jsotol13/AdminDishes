/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: DaoHibernate of mealSubscription of de the table mealSubscription
 */

package com.mycompany.webapp.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import com.mycompany.webapp.dao.MealSubscriptionDao;
import com.mycompany.webapp.model.MealSubscription;

@Repository("mealSubscriptionDao")
public class MealSubscriptionDaoHibernate extends GenericDaoHibernate<MealSubscription, Long>
		implements MealSubscriptionDao {
	
	public MealSubscriptionDaoHibernate() {
		super(MealSubscription.class);
	}
}
