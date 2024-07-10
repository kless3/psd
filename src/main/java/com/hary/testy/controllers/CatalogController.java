package com.hary.testy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {
    @GetMapping("/catalog")
    public String getCatalog() {
        return "catalog";
    }
    @GetMapping("/info")
    public String getInfo(){
        return "order";
    }
}
