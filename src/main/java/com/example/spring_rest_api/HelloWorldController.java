package com.example.spring_rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (endpoint)
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world"))
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }


}
