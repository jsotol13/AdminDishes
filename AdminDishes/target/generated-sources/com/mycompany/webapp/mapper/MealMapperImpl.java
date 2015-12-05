package com.mycompany.webapp.mapper;

import com.mycompany.webapp.dto.MealDTO;
import com.mycompany.webapp.model.Meal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-12-02T19:29:00-0600",
    comments = "version: 1.0.0.CR2, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
public class MealMapperImpl implements MealMapper {

    @Override
    public List<MealDTO> mealsToMealDTOs(List<Meal> meals) {
        if ( meals == null ) {
            return null;
        }

        List<MealDTO> list = new ArrayList<MealDTO>();
        for ( Meal meal : meals ) {
            list.add( mealToMealDTO( meal ) );
        }

        return list;
    }

    @Override
    public MealDTO mealToMealDTO(Meal meal) {
        if ( meal == null ) {
            return null;
        }

        MealDTO mealDTO_ = new MealDTO();

        mealDTO_.setDescriptionMeal( meal.getDescriptionMeal() );
        mealDTO_.setMealID( meal.getMealID() );
        mealDTO_.setStateMeal( meal.getStateMeal() );
        mealDTO_.setPicture( meal.getPicture() );
        mealDTO_.setNameMeal( meal.getNameMeal() );

        return mealDTO_;
    }
}
