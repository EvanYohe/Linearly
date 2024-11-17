package com.linearly.model;

public class ColMatrix {

    private int rowDimension;
    private int colDimension;

    // represents a 1xn matrix where n is the number of Col vectors
    private ColVector[] matrix;

    public ColMatrix(int rowDimension, int colDimension) {

        this.rowDimension = rowDimension;
        this.colDimension = colDimension;
        this.matrix = new ColVector[colDimension];

        for (int i = 0; i < colDimension; i++) {
            matrix[i] = new ColVector(rowDimension);
        }
    }

    public int getRowDimension() {
        return rowDimension;
    }
    
    public int getColDimension() {
        return colDimension;
    }

    public ColVector[] getColMatrix() {
        return matrix;
    }

    public void setColMatrix(ColVector[] matrix) {
        this.matrix = matrix;
    }

    public ColVector getColVector(int index) {
        return matrix[index];
    }

    public void setColVector(int index, ColVector vector) {
        matrix[index] = vector;
    }

    public double getColMatrixEntry(int row, int col) {
        return matrix[col].getColEntry(row);
    }

    public void setColMatrixEntry(int row, int col, double value) {
        matrix[col].setColEntry(row, value);
    }

    public RowMatrix produceRowMatrix() {
        RowMatrix rowMatrix = new RowMatrix(rowDimension, colDimension);

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                rowMatrix.setRowMatrixEntry(i, j, getColMatrixEntry(i, j));
            }
        }

        return rowMatrix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                sb.append(getColMatrixEntry(i, j) + "  ");
            }
            sb.append("\n");
            sb.append("\n");
        }

        return sb.toString();
    }
}