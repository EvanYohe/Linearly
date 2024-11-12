package com.linearly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.linearly.model.Dimension;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/") // removing this mapping wil break the index page
    public String index() {

        return "page";
    }

    @PostMapping("matrixmodule")
    public String matrixModule(@ModelAttribute Dimension dimension, Model model) {

        model.addAttribute("dimension", dimension);
        return "matrixmodule";
    }

    @PostMapping("eliminationmodule")
    public String eliminationModule() {

        return "eliminationmodule";
    }

    @PostMapping("vectorspacemodule")
    public String vectorspaceModule() {

        return "vectorspacemodule";
    }
}
