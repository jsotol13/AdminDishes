/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */
package com.mycompany.webapp.services;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.appfuse.service.GenericManager;

import com.mycompany.webapp.dto.MealDTO;
import com.mycompany.webapp.model.Meal;

@WebService
@Path("/meal")
public interface MealManager extends GenericManager<Meal, Long> {
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<MealDTO> getMeals();

	@GET
	@Path("/namemeal/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<MealDTO> findByName(@QueryParam("name") String name);
	// URL: /services/api/people/search?lastname=Raible

	@GET
	@Path("/mealid/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	MealDTO findByID(@QueryParam("id") Long id);
	// URL: /services/api/meal/arroz

}
