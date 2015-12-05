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
import javax.ws.rs.core.MediaType;

import com.mycompany.webapp.model.MealSubscription;

@WebService
@Path("/mealsubscription")
public interface MealSubscriptionManager {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<MealSubscription> getMealSubscription();

}
