package org.zw.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zw.service.HelloService;

@RestController
public class HelloRest {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value = "/msg/{name}", method = RequestMethod.GET)
	public String msg(@PathVariable(value = "name")String name) {
		return helloService.getMessage() + "\t" +  name;
	}
	
}
