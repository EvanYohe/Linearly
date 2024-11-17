package com.linearly.model;

public class ColVector {

    private int dimension;
    private double[] vector;

    public ColVector(int dimension) {
        this.dimension = dimension;
        this.vector = new double[dimension];
    }

    public ColVector(double[] vector) {
        this.vector = vector;
        this.dimension = vector.length;
    }

    public int getColDimension() {
        return dimension;
    }

    public double[] getColVector() {
        return vector;
    }

    public void setColVector(double[] vector) {
        this.vector = vector;
    }

    public double getColEntry(int index) {
        return vector[index];
    }

    public void setColEntry(int index, double value) {
        vector[index] = value;
    }
}
