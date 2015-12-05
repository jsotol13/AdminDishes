/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */


package com.mycompany.webapp.service.impl;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.mycompany.webapp.dao.MealDao;
import com.mycompany.webapp.model.Meal;
import com.mycompany.webapp.model.Subscription;

public class MealManagerImplTest extends BaseManagerMockTestCase {
	
	@InjectMocks
    private MealManagerImpl manager;

    @Mock
    private MealDao dao;

    @Test
    public void testGetMeal() {
       final Long id = 1L;
        final Meal meal = new Meal();
        given(dao.get(id)).willReturn(meal);
        
        Meal result = manager.get(id);
        
        assertSame(meal, result);
    }

    @Test
    public void testGetMeals() {
        log.debug("testing getAll...");
        //given
        final List meals = new ArrayList();
        given(dao.getAll()).willReturn(meals);

        //when
        List result = manager.getAll();

        //then
        assertSame(meals, result);
    }

    
    @Test
    public void testSaveMeal() {
        log.debug("testing save...");

        //given
        final Meal meal = new Meal();
        // enter all required fields

        given(dao.save(meal)).willReturn(meal);

        //when
        manager.save(meal);

        //then
        verify(dao).save(meal);
    }
    
    
    @Test
    public void testRemoveMeal() {
        log.debug("testing remove...");

        //given
        final Long id = 1L;
        willDoNothing().given(dao).remove(id);

        //when
        manager.remove(id);

        //then
        verify(dao).remove(id);
    }
	

}
