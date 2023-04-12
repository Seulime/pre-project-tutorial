package com.seulime.preprojecttutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreProjectTutorialController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}