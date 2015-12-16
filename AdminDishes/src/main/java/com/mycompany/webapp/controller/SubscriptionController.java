package com.mycompany.webapp.controller;

import org.appfuse.service.GenericManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.webapp.model.Subscription;

@Controller
@RequestMapping("/subscriptions*")
public class SubscriptionController {
    private GenericManager<Subscription, Long> subscriptionManager;

    @Autowired
    public void setSubscriptionManager(@Qualifier("subscriptionManager") GenericManager<Subscription, Long> subscriptionManager) {
        this.subscriptionManager = subscriptionManager;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest()
    throws Exception {
        return new ModelAndView().addObject(subscriptionManager.getAll());
    }
}