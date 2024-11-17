package com.linearly.model;

public class RowMatrix {

    private int rowDimension;
    private int colDimension;

    // represents a nx1 matrix where n is the number of row vectors
    private RowVector[] matrix;

    public RowMatrix(int rowDimension, int colDimension) {

        this.rowDimension = rowDimension;
        this.colDimension = colDimension;
        this.matrix = new RowVector[rowDimension];

        for (int i = 0; i < rowDimension; i++) {
            matrix[i] = new RowVector(colDimension);
        }
    }

    public int getRowDimension() {
        return rowDimension;
    }
    
    public int getColDimension() {
        return colDimension;
    }

    public RowVector[] getRowMatrix() {
        return matrix;
    }

    public void setRowMatrix(RowVector[] matrix) {
        this.matrix = matrix;
    }

    public RowVector getRowVector(int index) {
        return matrix[index];
    }

    public void setRowVector(int index, RowVector vector) {
        matrix[index] = vector;
    }

    public double getRowMatrixEntry(int row, int col) {
        return matrix[row].getRowEntry(col);
    }

    public void setRowMatrixEntry(int row, int col, double value) {
        matrix[row].setRowEntry(col, value);
    }

    public ColMatrix produceColMatrix() {
        ColMatrix colMatrix = new ColMatrix(rowDimension, colDimension);

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                colMatrix.setColMatrixEntry(i, j, getRowMatrixEntry(i, j));
            }
        }

        return colMatrix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < colDimension; j++) {
                sb.append(getRowMatrixEntry(i, j) + "  ");
            }
            sb.append("\n");
            sb.append("\n");
        }

        return sb.toString();
    }
}