package com.hary.testy.controllers;

import com.hary.testy.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import static java.util.Collections.reverse;

@Controller
public class GreetingController {
@GetMapping("/")
    public String greeting(@ModelAttribute("customer") Customer customer, @RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        String upperCase = name.toUpperCase();
        model.addAttribute("upperName", upperCase);
        return "greeting";
    }

}
