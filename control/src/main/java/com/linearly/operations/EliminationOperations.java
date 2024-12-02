package com.linearly.operations;

import com.linearly.model.Matrix;

public class EliminationOperations {

    static final double EPSILON = 1.0e-6;

    /**
     * Reduce a matrix to row echelon form using Gaussian elimination
     * 
     * @param matrix
     * @return Matrix
     */
    public static Matrix rowEchelonForm(Matrix matrix) {

        double[][] temp = matrix.getMatrix();
        int rowCount = matrix.getRowDimension();

        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {

            int pivotIndex = rowIndex; 
            for (int j = rowIndex + 1; j < rowCount; j++) {
                if (Math.abs(temp[j][rowIndex]) > Math.abs(temp[pivotIndex][rowIndex])) {
                    pivotIndex = j;
                }
            }
            swap(temp, rowIndex, pivotIndex);

            for (int j = rowIndex + 1; j < rowCount; j++) {
                double scalar = temp[j][rowIndex] / temp[rowIndex][rowIndex];
                temp[j] = subtract(temp[j], scale(temp[rowIndex], scalar));
            }
            temp[rowIndex] = scale(temp[rowIndex], 1 / temp[rowIndex][rowIndex]);
        }
        matrix.setMatrix(temp);
        return matrix;
    }

    /**
     * Reduce a matrix to reduced row echelon form using
     * back substitution on a matrix in row echelon form
     * 
     * @param matrix
     * @return Matrix
     */
    public static Matrix reducedRowEchelonForm(Matrix matrix) {

        double[][] reduced = rowEchelonForm(matrix).getMatrix();

        for (int i = reduced.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                double scalar = reduced[j][i] / reduced[i][i];
                reduced[j] = subtract(reduced[j], scale(reduced[i], scalar));
            }
        }
        matrix.setMatrix(reduced);
        return matrix;
    }

    /**
     * Swap two rows in a matrix
     * 
     * @param matrix
     * @param rowOne
     * @param rowTwo
     */
    private static void swap(double[][] matrix, int rowOne, int rowTwo) {
        double[] temp = matrix[rowOne];
        matrix[rowOne] = matrix[rowTwo];
        matrix[rowTwo] = temp;
    }

    /**
     * Subtract two rows in a matrix
     * 
     * @param rowOne
     * @param rowTwo
     * @return double[]
     */
    private static double[] subtract(double[] rowOne, double[] rowTwo) {
        double[] result = new double[rowOne.length];
        for (int i = 0; i < rowOne.length; i++) {
            result[i] = rowOne[i] - rowTwo[i];
        }
        return result;
    }

    /**
     * Scale the row of a matrix by a scalar
     * 
     * @param row
     * @param scalar
     * @return double[]
     */
    private static double[] scale(double[] row, double scalar) {
        double[] result = new double[row.length];
        for (int i = 0; i < row.length; i++) {
            result[i] = row[i] * scalar;
        }
        return result;
    }
}
