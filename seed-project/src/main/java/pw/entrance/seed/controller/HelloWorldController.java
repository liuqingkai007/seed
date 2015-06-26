package pw.entrance.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.entrance.seed.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/sayhell")
	public String sayHello() {
		return this.helloService.sayHello();
	}
}
