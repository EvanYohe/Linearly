package com.linearly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linearly.model.Matrix;
import com.linearly.operations.EliminationOperations;
import com.linearly.operations.MatrixOperations;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		Matrix matrix = new Matrix(new double[][] {
			{ 8, 4, 8 },
			{ 14, 10, 17 },
			{ 16, 16, 29 }
		});
		
		EliminationOperations.rowEchelonForm(matrix).printMatrix();
		EliminationOperations.reducedRowEchelonForm(matrix).printMatrix();

		// TODO: Remove before testing in web setting
		System.exit(1);
		SpringApplication.run(MainApplication.class, args);
	}
}
