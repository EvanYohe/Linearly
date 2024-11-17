package com.linearly.model;

public class Matrix {

    protected int rowDimension;
    protected int colDimension;

    public Matrix(int rowDimension, int colDimension) {
        this.rowDimension = rowDimension;
        this.colDimension = colDimension;
    }

    public int getRowDimension() {
        return rowDimension;
    }

    public int getColDimension() {
        return colDimension;
    }

    public boolean isSquare() {

        return rowDimension == colDimension;
    }

    // TODO: Not all square matricies are invertible
    public boolean isInvertible() {

        return isSquare();
    }

    public boolean isSymmetric() {

        return false;
    }

    public boolean isDiagonal() {

        return false;
    }

    public boolean isIdentity() {

        return false;
    }

    public double getDeterminant() {

        return 0;
    }
}
