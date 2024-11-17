package com.linearly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linearly.model.ColMatrix;
import com.linearly.model.ColVector;
import com.linearly.model.RowMatrix;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		
		ColMatrix colMatrix = new ColMatrix(3, 6);
		RowMatrix rowMatrix = new RowMatrix(4, 3);

		ColVector colOne = new ColVector(new double[] {1, 2, 3});
		ColVector colTwo = new ColVector(new double[] {4, 5, 6});
		ColVector colThree = new ColVector(new double[] {7, 8, 9});
		ColVector colFour = new ColVector(new double[] {10, 11, 12});
		ColVector colFive = new ColVector(new double[] {13, 14, 15});
		ColVector colSix = new ColVector(new double[] {16, 17, 18});

		colMatrix.setColVector(0, colOne);
		colMatrix.setColVector(1, colTwo);
		colMatrix.setColVector(2, colThree);
		colMatrix.setColVector(3, colFour);
		colMatrix.setColVector(4, colFive);
		colMatrix.setColVector(5, colSix);

		System.out.println("Col Matrix:");
		System.out.println(colMatrix.toString());

		rowMatrix = colMatrix.produceRowMatrix();

		System.out.println("Row Matrix:");
		System.out.println(rowMatrix.toString());

		ColMatrix newColMatrix = rowMatrix.produceColMatrix();

		System.out.println("New Col Matrix:");
		System.out.println(newColMatrix.toString());
		
		// TODO: Remove before testing in web setting
		System.exit(1);
		SpringApplication.run(MainApplication.class, args);
	}
}
