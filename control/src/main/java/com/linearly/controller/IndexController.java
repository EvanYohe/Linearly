package com.linearly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    /*
     * Maps the HTTP GET request to the root URL to the index.jte file.
     * 
     * @param Model the model object to be used in the view
     * @return String: the name of the template file to render in the view
     */
    @GetMapping("/")
    public String index(Model Model) {
        return "index";
    }

    /*
     * Maps the HTTP POST request to the matrix-module URL to the matrix-module.jte file.
     * 
     * @param Model the model object to be used in the view
     * @return String: the name of the template file to render in the view
     */
    @PostMapping("/matrix-module")
    public String loadMatrixModule(Model model) {
        return "matrix-module";
    }

    /*
     * Maps the HTTP POST request to the elimination-module URL to the elimination-module.jte file.
     * 
     * @param Model the model object to be used in the view
     * @return String: the name of the template file to render in the view
     */
    @PostMapping("/elimination-module")
    public String loadEliminationModule(Model model) {
        return "elimination-module";
    }

    /* 
     * TODO: replace temporary return value when vectorspace-module.jte is created
     * Maps the HTTP POST request to the vectorspace-module URL to the vectorspace-module.jte file.
     * 
     * @param Model the model object to be used in the view
     * @return String: the name of the template file to render in the view
     */
    @PostMapping("/vectorspace-module")
    public String loadVectorspaceModule(Model model) {
        return "matrix-module";
    }
}
