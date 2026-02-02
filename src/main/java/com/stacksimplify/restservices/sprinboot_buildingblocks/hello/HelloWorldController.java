package com.stacksimplify.restservices.sprinboot_buildingblocks.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld1")
public String HelloWorld(){
	return "Hello World";
}
	@GetMapping("/userdetails")
	public UserDetails userDetailsBean() {
		return new UserDetails("Aravind","Pippiri","Hyd");
		
	}
	
}
