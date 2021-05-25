package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotação que indica que é uma classe controladora
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String sayHello(){
		
		return "Hello World!!!";
	}
}
