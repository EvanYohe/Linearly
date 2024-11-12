package com.linearly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.linearly.model.Dimension;

@Controller
public class MatrixController {

    @RequestMapping("/matrixdata") // /matrixmodule/matrixdata
    public String matrixData() {

        return "matrixdata";
    }

    @PostMapping("/matrixmodule/4x4")
    public String matrixDimensions(@RequestParam int rows, @RequestParam int cols) {

        Dimension dimensions = new Dimension(rows, cols);
        return "matrixmodule/4x4";
    }

    @GetMapping("/matrixmodule/4x4")
    public String matrix() {

        return "4x4";
    }

}
