package com.linearly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linearly.model.EliminationOperations;
import com.linearly.model.Matrix;
import com.linearly.model.MatrixOperations;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
	
		Matrix matrix = new Matrix(new double[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 }
		});

		Matrix identity = new Matrix(new double[][] {
			{ 1, 0, 0 },
			{ 0, 1, 0 },
			{ 0, 0, 1 }
		});
		
		System.out.println(MatrixOperations.isSquare(matrix));
		System.out.println(MatrixOperations.isDiagonal(matrix));
		System.out.println(MatrixOperations.isInvertible(matrix));
		System.out.println(MatrixOperations.isSymmetric(matrix));
		System.out.println(MatrixOperations.isIdentity(matrix));
		System.out.println(MatrixOperations.getDeterminant(matrix));
		MatrixOperations.getTranspose(matrix).printMatrix();

		System.out.println(MatrixOperations.isSquare(identity));
		System.out.println(MatrixOperations.isDiagonal(identity));
		System.out.println(MatrixOperations.isInvertible(identity));
		System.out.println(MatrixOperations.isSymmetric(identity));
		System.out.println(MatrixOperations.isIdentity(identity));
		System.out.println(MatrixOperations.getDeterminant(identity));
		MatrixOperations.getTranspose(identity).printMatrix();

		// TODO: Remove before testing in web setting
		System.exit(1);
		SpringApplication.run(MainApplication.class, args);
	}
}
