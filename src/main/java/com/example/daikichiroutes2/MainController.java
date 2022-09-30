package com.example.daikichiroutes2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/daikichi")
    public String index(){
        return "Welcome!";
    }

    @RequestMapping("/daikichi/today")
    public String luck(){
        return "Today you will find luck";
    }

    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow(){
        return "Today, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
