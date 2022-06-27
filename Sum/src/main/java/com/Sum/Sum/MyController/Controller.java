package com.Sum.Sum.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/add/{a},{b}")
    public String addition(@PathVariable ("a") int a, @PathVariable ("b") int b){
        int res = a+b;
        return "The addition result is " + res;
    }
}
