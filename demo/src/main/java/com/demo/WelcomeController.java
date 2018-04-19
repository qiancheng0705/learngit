package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//一个简单的Spring控制器类
//@Controller
@RestController
public class WelcomeController {

	 // inject via application.properties
    @Value("${welcome.message}")
    private String message = "Hello World";

    @GetMapping("/welcome")
    public String welcome(Model model) {
    	model. addAttribute("message", this.message);
        return "welcome";
    }

    @GetMapping("/hello")
    public String hello() {
    	
        return message;
    }
}
