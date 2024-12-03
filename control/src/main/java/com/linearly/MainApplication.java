package com.linearly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linearly.model.Matrix;
import com.linearly.operations.EliminationOperations;
import com.linearly.operations.MatrixOperations;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		// Matrix matrixA = new Matrix(new double[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		// Matrix matrixB = new Matrix(new double[][] { { 2, 3, 2 }, { 3, 2, 3 }, { 2, 3, 2 } });

		// TODO: Remove before testing in web setting
		// System.exit(1);
		SpringApplication.run(MainApplication.class, args);
	}
}
