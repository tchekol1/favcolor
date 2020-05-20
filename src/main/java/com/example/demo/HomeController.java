package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class HomeController {



   @RequestMapping("/")
    public String rform(Model model){
       Random random= new Random();
       int x=random.nextInt();
        model.addAttribute("x",x);
        return "askform";
    }

    @RequestMapping("/processform")
    public String laodfrompage(@RequestParam("name") String name,@RequestParam("quest") String quest,@RequestParam("q3") String q3, Model model){
        model.addAttribute("nameval",name);
        model.addAttribute("questval",quest);
        model.addAttribute("q3",q3);
        return "confirm";
    }
}
