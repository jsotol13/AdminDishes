/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */

package com.mycompany.webapp.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.mycompany.webapp.dto.MealDTO;
import com.mycompany.webapp.model.Meal;
@Mapper
public interface MealMapper {

	MealMapper INSTANCE = Mappers.getMapper(MealMapper.class);

	List<MealDTO> mealsToMealDTOs(List<Meal> meals);

	@Mappings({ @Mapping(source = "mealID", target = "mealID"), @Mapping(source = "nameMeal", target = "nameMeal"),
			@Mapping(source = "picture", target = "picture"),
			@Mapping(source = "descriptionMeal", target = "descriptionMeal"),
			@Mapping(source = "stateMeal", target = "stateMeal"), })
	MealDTO mealToMealDTO(Meal meal);

}
