package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day3A {
	private String yourFavColor="Green";
    @GetMapping("/")
    public String getMyFav() {
        return "My favourite color is "+yourFavColor;
    }
}

