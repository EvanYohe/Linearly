package com.linearly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.linearly.model.Matrix;

@Controller
public class MatrixController {

    @GetMapping("/matrix-module")
    public String loadMatrixModule(Model model) {

        model.addAttribute("matrixA", new Matrix(3, 3));
        model.addAttribute("matrixB", new Matrix(3, 3));

        return "matrix-module";
    }

    @GetMapping("/submit-matrix-A")
    public String submitInputA(@RequestParam int rowsMatrixA, @RequestParam int colsMatrixA, Matrix matrixA, Model model) {

        matrixA.setRowDimension(rowsMatrixA);
        matrixA.setColDimension(colsMatrixA);
        model.addAttribute("matrixA", matrixA);
        model.addAttribute("rowsMatrixA", rowsMatrixA);
        model.addAttribute("colsMatrixA", colsMatrixA);

        return "input-matrix-A";
    }
    @GetMapping("/submit-matrix-B")
    public String submitInputB(@RequestParam int rowsMatrixB, @RequestParam int colsMatrixB, Matrix matrixB, Model model) {

        matrixB.setRowDimension(rowsMatrixB);
        matrixB.setColDimension(colsMatrixB);
        model.addAttribute("matrixB", matrixB);
        model.addAttribute("rowsMatrixB", rowsMatrixB);
        model.addAttribute("colsMatrixB", colsMatrixB);

        return "input-matrix-B";
    }
}