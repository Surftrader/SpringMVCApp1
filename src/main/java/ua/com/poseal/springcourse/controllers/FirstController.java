package ua.com.poseal.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name,
                            @RequestParam("surname") String surname) {

        System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodBeyPage() {
        return "first/goodbye";
    }
}
