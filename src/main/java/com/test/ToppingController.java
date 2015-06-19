package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/toppings")
@Controller
@RooWebScaffold(path = "toppings", formBackingObject = Topping.class)
public class ToppingController {
	@Autowired
	private Service service;
	
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    @ResponseBody
    public String getWorkItems()  {
    	return service.getText();
    }

}
