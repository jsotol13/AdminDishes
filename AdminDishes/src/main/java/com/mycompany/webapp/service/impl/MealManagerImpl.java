/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */
package com.mycompany.webapp.service.impl;

import java.util.List;
import javax.jws.WebService;
import javax.transaction.Transactional;
import org.appfuse.service.impl.GenericManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.MealDao;
import com.mycompany.webapp.dto.MealDTO;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.mapper.MealMapper;
import com.mycompany.webapp.mapper.SubscriptionMapper;
import com.mycompany.webapp.model.Meal;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.services.MealManager;

@Transactional
@Service("mealManager")
@WebService(serviceName = "MealService", endpointInterface = "org.appfuse.tutorial.service.MealManager")
public class MealManagerImpl extends GenericManagerImpl<Meal, Long>implements MealManager {
	MealDao mealDao;

	public MealManagerImpl() {
	}

	@Autowired
	public MealManagerImpl(MealDao mealDao) {
		super(mealDao);
		this.mealDao = mealDao;
	}

	public List<MealDTO> getMeals() {

		List<MealDTO> mealDTOList = null;

		List<Meal> mealList = mealDao.getAll();
		mealDTOList = MealMapper.INSTANCE.mealsToMealDTOs(mealList);
		return mealDTOList;
	}

	@Override
	public List<MealDTO> findByName(String nameMeal) {
		List<MealDTO> mealDTOList = null;
		List<Meal> mealList = mealDao.findByName(nameMeal);
		mealDTOList = MealMapper.INSTANCE.mealsToMealDTOs(mealList);
		return mealDTOList;

	}

	@Override
	public MealDTO findByID(Long mealid) {
		MealDTO mealDTO = null;
		Meal meal = mealDao.get(mealid);
		mealDTO = MealMapper.INSTANCE.mealToMealDTO(meal);
		return mealDTO;
	}

}
