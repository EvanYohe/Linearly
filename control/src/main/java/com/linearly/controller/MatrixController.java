package com.linearly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.linearly.model.Matrix;

@Controller
public class MatrixController {

    /*
     * Maps the HTTP POST request to the matrix-module URL to the matrix-module.jte file.
     * 
     * @param Model the model object to be used in the view
     * @return String: the name of the template file to render in the view
     */
    @PostMapping("/matrix-module")
    public String loadMatrixModule(Model model) {

        int newRows = 3;
        int newCols = 3;
        model.addAttribute("newRows", newRows);
        model.addAttribute("newCols", newCols);
        model.addAttribute("inputMatrixA", new Matrix(3, 3));
        model.addAttribute("inputMatrixB", new Matrix(3, 3));
        model.addAttribute("outputMatrix", new Matrix(3, 3));

        return "matrix-module";
    }

    @PostMapping("/submit-input-A")
    public String submitInputA(@RequestParam int newRows, @RequestParam int newCols, Model model) {

        model.addAttribute("inputMatrixA", new Matrix(newRows, newCols));
        return "matrix-module";
    }

}
