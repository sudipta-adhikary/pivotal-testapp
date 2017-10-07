package com.cts.pivotal.pivotaltestapp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/testapp")
public class PivotalTestAppResource {

	@GetMapping("/{username}")
	public String sayHello(@PathVariable String username) {
		return "Hello " + username + "!!!!, welcome to Pivotal Cloud Foundry!";
	}

}
