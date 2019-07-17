package com.lowes.restapidemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping("/string-message")
	public String getStringMessage() {
		return "Welcome";
	}
	
	@GetMapping("/object-message")
	public HelloworldObject getObjectMessage() {
		return new HelloworldObject(1, "aaa");
	}
	
	@GetMapping("/object-message-path/{name}")
	public HelloworldObject getObjectMessagePathVariable(@PathVariable String name) {
		return new HelloworldObject(1, "Janaarthan_" + name);
	}
}
