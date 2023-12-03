package com.net.springboot.demo.mysbapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" for saying hello
    @GetMapping("/")
    public String sayHello(){
        return "Yo there!!!";
    }
}
