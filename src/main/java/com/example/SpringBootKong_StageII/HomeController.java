package com.example.SpringBootKong_StageII;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/test1")
    public String test1(){
        return "Welcome to SpringBoot Application !";
    }

    @GetMapping("/test2")
    public String test2(){
        return "Welcome to SpringBoot Application ! with KONG";
    }
}
