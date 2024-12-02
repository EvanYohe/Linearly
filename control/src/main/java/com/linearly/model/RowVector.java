package com.linearly.model;

public class RowVector {

    private int dimension;
    private double[] vector;

    /**
     * Default constructor for creating an empty row vector
     * 
     */
    public RowVector() {
        this.dimension = 0;
        this.vector = null;
    }

    /**
     * Constructor for creating a row vector from an array
     * 
     * @param vector
     */
    public RowVector(double[] vector) {
        this.vector = vector;
        this.dimension = vector.length;
    }

    /**
     * Constructor for creating an empty row vector of zeros with size n
     * 
     * @param dimension
     */
    public RowVector(int dimension) {
        this.dimension = dimension;
        this.vector = new double[dimension];
    }

    /**
     * Returns the dimension of the row vector
     * 
     * @return int
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * Returns the row vector as an array
     * 
     * @return double[]
     */
    public double[] getVector() {
        return vector;
    }

    /**
     * Set the row vector from an array
     * 
     * @param index
     * @return
     */
    public void setVector(double[] vector) {
        this.vector = vector;
        this.dimension = vector.length;
    }

    /**
     * Returns the element at the specified index
     * 
     * @param index
     * @return double
     */
    public double getElement(int index) {
        return vector[index];
    }

    /**
     * Sets the element at the specified index
     * 
     * @param index
     * @param value
     */
    public void setElement(int index, double value) {
        vector[index] = value;
    }

    /**
     * Copy the RowVector object and return a new RowVector object
     * 
     * @return RowVector
     */
    public RowVector copy() {
        RowVector copy = new RowVector(dimension);
        for (int i = 0; i < dimension; i++) {
            copy.setElement(i, vector[i]);
        }
        return copy;
    }

    /**
     * Prints the row vector to the console
     * Internal debugging method
     * 
     */
    public void printVector() {

        String output = "[";
        for (int i = 0; i < dimension; i++) {
            output += vector[i];
            if (i < dimension - 1) {
                output += ", ";
            }
        }
        output += "]";
        System.out.println(output);
    }
}
