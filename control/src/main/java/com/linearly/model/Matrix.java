package com.linearly.model;

public class Matrix {

    protected int rowDimension;
    protected int colDimension;
    protected double[][] matrix;
    final double EPSILON = 1.0e-7;

    /**
     * Default constructor for creating an empty matrix
     * 
     */
    public Matrix() {
        this.rowDimension = 0;
        this.colDimension = 0;
        this.matrix = null;
    }

    /**
     * Constructor for creating a matrix from a 2D array
     * 
     * @param matrix
     */
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rowDimension = matrix.length;
        this.colDimension = matrix[0].length;
    }

    /**
     * Constructor for creating an empty matrix of zeros with size m x n
     * 
     * @param rowDimension
     * @param colDimension
     */
    public Matrix(int rowDimension, int colDimension) {
        this.rowDimension = rowDimension;
        this.colDimension = colDimension;
        this.matrix = new double[rowDimension][colDimension];
    }

    /**
     * Returns the number of rows in the matrix
     * 
     * @return int
     */
    public int getRowDimension() {
        return rowDimension;
    }

    /**
     * Returns the number of columns in the matrix
     * 
     * @return int
     */
    public int getColDimension() {
        return colDimension;
    }

    /**
     * Returns the matrix as a 2D array of doubles
     * 
     * @return double[][]
     */
    public double[][] getMatrix() {
        return matrix;
    }

    /**
     * Sets the matrix to a 2D array of doubles
     * 
     * @param matrix
     */
    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Gets the value of a matrix entry at a given row and column
     * 
     * @param row
     * @param col
     */
    public double getEntry(int row, int col) {
        return matrix[row][col];
    }

    /**
     * Sets the value of a matrix entry at a given row and column
     * 
     * @param row
     * @param col
     * @param value
     */
    public void setEntry(int row, int col, double value) {
        matrix[row][col] = value;
    }

    /**
     * Internal print function for terminal testing
     * 
     */
    public void printMatrix() {

        String format = "| %5.1f ";

        for (int i = 0; i < colDimension; i++) {
            System.out.print("+-------");
        }
        System.out.println("+");
		for (int i = 0; i < rowDimension; i++) {
			for (int j = 0; j < colDimension; j++) {
				System.out.printf(format, getEntry(i, j));
			}
			System.out.println("|");
            for (int k = 0; k < colDimension; k++) {
                System.out.print("+-------");
            }
            System.out.println("+");
		}
    }

    /**
     * Determines if a matrix is n x n dimensional (square)
     * 
     * @return boolean
     */
    public boolean isSquare() {

        return rowDimension == colDimension;
    }

    /**
     * Determines if a matrix is invertible using gaussian elimination
     * 
     * @return boolean
     */
    // TODO: REVISIT WITH GAUSSIAN ELIMINATION TO REDUCE COMPUTATION
    public boolean isInvertible() {

        if (getDeterminant() == 0) return false;

        return true;
    }

    /**
     * Determines if the ij-th entry is equal to the ji-th entry for all i, j
     * i.e. if the matrix is symmetrix along the main diagonal
     * 
     * @return boolean
     */
    public boolean isSymmetric() {

        if (!isSquare()) return false;

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                if (getEntry(i, j) != getEntry(j, i)) return false;
            }
        }

        return true;
    }

    /**
     * Determines if the ij-th entry is equal to zero for all i != j
     * i.e. if the matrix entry has a value of zero when i != j
     * 
     * @return boolean
     */
    public boolean isDiagonal() {

        if (!isSquare()) return false;

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                if (getEntry(i, j) != getEntry(j, i)) return false;
            }
        }

        return true;
    }

    /**
     * Determines if the ij-th entry is equal to 1 for all i == j
     * i.e. if the matrix entry has a value of one when i == j
     * 
     * @return boolean
     */
    public boolean isIdentity() {

        if (!isDiagonal()) return false;

        for (int i = 0; i < rowDimension; i++) {
            if (getEntry(i, i) != 1) return false;
        }

        return true;
    }

    /**
     * Returns the transpose of the matrix
     * i.e rows become columns and columns become rows
     * 
     * @return Matrix
     */
    public Matrix getTranspose() {

        double[][] temp = new double[colDimension][rowDimension];

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                temp[j][i] = matrix[i][j];
            }
        }

        Matrix transpose = new Matrix(temp);
        return transpose;
    }

    /**
     * Returns the inverse of the matrix
     * i.e. the matrix that when multiplied by the original matrix gives the identity matrix
     * 
     * @return Matrix
     */
    // TODO: REVISIT WITH GAUSSIAN ELIMINATION TO REDUCE COMPUTATION
    public Matrix getInverse() {

        return new Matrix();
    }

    // TODO: REVISIT
    public double getDeterminant() {

        if (!isSquare()) throw new IllegalArgumentException("Matrix must be square");

        return getDeterminant(matrix);
    }

    // TODO: REVISIT
    private double getDeterminant(double[][] matrix) {

        if (rowDimension == 1) return getEntry(0, 0);
        if (rowDimension == 2) return (getEntry(0, 0) * getEntry(1, 1)) - (getEntry(0, 1) * getEntry(1, 0));
        if (rowDimension == 3) {
            return (getEntry(0, 0) * getEntry(1, 1) * getEntry(2, 2)) +
                    (getEntry(0, 1) * getEntry(1, 2) * getEntry(2, 0)) +
                    (getEntry(0, 2) * getEntry(1, 0) * getEntry(2, 1)) -
                    (getEntry(0, 2) * getEntry(1, 1) * getEntry(2, 0)) -
                    (getEntry(0, 0) * getEntry(1, 2) * getEntry(2, 1)) -
                    (getEntry(0, 1) * getEntry(1, 0) * getEntry(2, 2));
        }
        if (isDiagonal()) {
            double determinant = 1;
            for (int i = 0; i < rowDimension; i++) {
                determinant *= getEntry(i, i);
            }
            return determinant;
        }
        
        return laplaceExpansion(matrix);
    }

    // TODO: REVISIT
    private double laplaceExpansion(double[][] matrix) {

        if (matrix.length == 3) {
            return (matrix[0][0] * matrix[1][1] * matrix[2][2]) +
                    (matrix[0][1] * matrix[1][2] * matrix[2][0]) +
                    (matrix[0][2] * matrix[1][0] * matrix[2][1]) -
                    (matrix[0][2] * matrix[1][1] * matrix[2][0]) -
                    (matrix[0][0] * matrix[1][2] * matrix[2][1]) -
                    (matrix[0][1] * matrix[1][0] * matrix[2][2]);
        }

        double determinant = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sign = ((i & 1) == 0) ? +1 : -1;
            determinant += sign * getEntry(0, i) * laplaceExpansion(subMatrix(matrix, 0, i));
        }

        return determinant;
    }

    // TODO: REVISIT
    private double[][] subMatrix(double[][] matrix, int excludedRow, int excludedCol) {

        double[][] subMatrix = new double[matrix.length - 1][matrix.length - 1];
        int rowPointer = -1;

        for (int i = 0; i < matrix.length; i++) {
          if (i == excludedRow) continue;
          
          ++rowPointer;
          int colPointer = -1;

          for (int j = 0; j < matrix.length; j++) {
            if (j == excludedCol) continue;

            subMatrix[rowPointer][++colPointer] = matrix[i][j];
          }
        }
        return subMatrix;
    }
}
