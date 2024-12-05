package com.linearly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.linearly.model.Matrix;

@Controller
public class MatrixController {

    @PostMapping("/matrix-module")
    public String loadMatrixModule(Model model) {

        model.addAttribute("matrixA", new Matrix());

        return "matrix-module";
    }

    @PostMapping("/submit-input-A")
    public String submitInputA(@RequestParam("rows") int rows, @RequestParam("cols") int cols, Matrix matrixA, Model model) {

        matrixA.setRowDimension(rows);
        matrixA.setColDimension(cols);
        model.addAttribute("matrixA", matrixA);
        return "matrix-module";
    }
}