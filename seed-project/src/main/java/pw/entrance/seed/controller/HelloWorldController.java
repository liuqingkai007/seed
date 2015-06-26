package pw.entrance.seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pw.entrance.seed.service.HelloService;

import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired
	private HelloService helloService;
	
	@ApiOperation(value = "测试1", httpMethod = "GET")
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return this.helloService.sayHello();
	}
}
