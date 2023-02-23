package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Day2 {
	@Value("${name.Names}")
    private String Name;
    @GetMapping("/")
    public String get()
    {
        return "Welcome"+Name;
    }

}
