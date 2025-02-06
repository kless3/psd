package com.hary.testy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {
    @GetMapping("/catalog")
    public String getCatalog() {
        return "catalog";
    }

    @GetMapping("/catalog/siding")
    public String getSiding() {
        return "catalog/siding";
    }

    @GetMapping("/catalog/facadePanels")
    public String getFacadePanels() {
        return "catalog/facadePanels";
    }

    @GetMapping("/catalog/facadeTiles")
    public String getFacadeTiles() {
        return "catalog/facadeTiles";
    }

    @GetMapping("/catalog/gutters")
    public String getGutters() {
        return "catalog/gutters";
    }

    @GetMapping("/catalog/roofing")
    public String getRoofing() {
        return "catalog/roofing";
    }


    @GetMapping("/info")
    public String getInfo() {
        return "order";
    }

    @GetMapping("/catalog/flexibleTiles")
    public String getFlexibleTiles() {
        return "catalog/flexibleTiles";
    }

}
