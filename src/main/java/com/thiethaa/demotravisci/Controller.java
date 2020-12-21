package com.thiethaa.demotravisci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String greeting(){
        return "Welcome from Travis-CI";
    }
}
