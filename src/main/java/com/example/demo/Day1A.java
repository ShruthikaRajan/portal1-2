package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1A {
	 @GetMapping("/")
	    public String show()
	    {
	        return "Welcome String Boot";
	    }
}
