package com.linearly.model;

public class RowVector {

    private int dimension;
    private double[] vector;

    public RowVector(int dimension) {
        this.dimension = dimension;
        this.vector = new double[dimension];
    }

    public RowVector(double[] vector) {
        this.vector = vector;
        this.dimension = vector.length;
    }

    public int getRowDimension() {
        return dimension;
    }

    public double[] getRowVector() {
        return vector;
    }

    public void setRowVector(double[] vector) {
        this.vector = vector;
    }

    public double getRowEntry(int index) {
        return vector[index];
    }

    public void setRowEntry(int index, double value) {
        vector[index] = value;
    }
}
