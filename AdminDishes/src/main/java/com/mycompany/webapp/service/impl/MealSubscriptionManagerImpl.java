/**
 * @author Oscar Esteban Rodriguez vargas 16/11/15 
 *Class: model of candidate of de the table candidate
 */

package com.mycompany.webapp.service.impl;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Transactional
@Service("mealSubscriptionManager")
@WebService(serviceName = "MealSubscriptionService", endpointInterface = "org.appfuse.tutorial.service.MealSubscriptionManager")
public class MealSubscriptionManagerImpl {

}
