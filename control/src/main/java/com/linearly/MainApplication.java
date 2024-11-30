package com.linearly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linearly.model.Matrix;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix(new double[][] {
			{774, 2, 3, 1},
			{4, 5, 6, 1},
			{7, 8, 9, 1},
			{1, 2, 3, 1},
			{1, 2, 3, 1}
		});

		Matrix transpose = matrix.getTranspose();
		
		matrix.printMatrix();
		transpose.printMatrix();
		
		// TODO: Remove before testing in web setting
		System.exit(1);
		SpringApplication.run(MainApplication.class, args);
	}
}
