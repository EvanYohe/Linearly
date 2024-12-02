package com.linearly.model;

public class EliminationOperations {

    static final double EPSILON = 1.0e-6;

    /**
     * Reduce a matrix to row echelon form using Gaussian elimination
     * 
     * @param matrix
     * @return Matrix
     */
    // TODO: VERIFY THIS METHOD WORKS AS INTENDED
    public static Matrix rowEchelonForm(Matrix matrix) {

        RowVector[] vectors = matrix.toRowVectors();

        for (int rowIndex = 0; rowIndex < vectors.length; rowIndex++) {

            int pivotIndex = rowIndex; 
            for (int j = rowIndex + 1; j < vectors.length; j++) {
                if (Math.abs(vectors[j].getElement(rowIndex)) > Math.abs(vectors[pivotIndex].getElement(rowIndex))) {
                    pivotIndex = j;
                }
            }
            swap(vectors, rowIndex, pivotIndex);

            for (int j = rowIndex + 1; j < vectors.length; j++) {
                double scalar = vectors[j].getElement(rowIndex) / vectors[rowIndex].getElement(rowIndex);
                vectors[j] = subtract(vectors[j], scale(vectors[rowIndex], scalar));
            }
            vectors[rowIndex] = scale(vectors[rowIndex], 1 / vectors[rowIndex].getElement(rowIndex));
        }
        Matrix augmentedMatrix = new Matrix(vectors);
        return augmentedMatrix;
    }

    /**
     * Reduce a matrix to reduced row echelon form using Gaussian elimination and back substitution
     * 
     * @param matrix
     * @return Matrix
     */
    // TODO: VERIFY THIS METHOD WORKS AS INTENDED
    public static Matrix reducedRowEchelonForm(Matrix matrix) {

        RowVector[] vector = matrix.toRowVectors();

        for (int rowIndex = 0; rowIndex < vector.length; rowIndex++) {

            int pivotIndex = rowIndex; 
            for (int j = rowIndex + 1; j < vector.length; j++) {
                if (Math.abs(vector[j].getElement(rowIndex)) > Math.abs(vector[pivotIndex].getElement(rowIndex))) {
                    pivotIndex = j;
                }
            }
            swap(vector, rowIndex, pivotIndex);
            double pivotScalar = vector[rowIndex].getElement(rowIndex);

            if (Math.abs(pivotScalar) > EPSILON) {
                vector[rowIndex] = scale(vector[rowIndex], 1 / pivotScalar);
            }
            for (int j = 0; j < vector.length; j++) {
                if (j != rowIndex) {
                    double backSubScalar = vector[j].getElement(rowIndex);
                    vector[j] = subtract(vector[j], scale(vector[rowIndex], backSubScalar));
                }
            }
        }
        Matrix augmentedMatrix = new Matrix(vector);
        return augmentedMatrix;
    }

    /**
     * Subtract the components of one RowVector object from another RowVector object
     * Elementary operation for Gaussian elimination
     * 
     * @param v1
     * @param v2
     * @return RowVector
     */
    private static RowVector subtract(RowVector v1, RowVector v2) {

        RowVector copy = v1.copy();
        if (copy.getDimension() != v2.getDimension()) throw new IllegalArgumentException("Vector dimensions must be the same");
        for (int i = 0; i < copy.getDimension(); i++) {
            copy.setElement(i, copy.getElement(i) - v2.getElement(i));
        }
        return copy;
    }
    
    /**
     * Scale a RowVector object by a scalar
     * Elementary operation for Gaussian elimination
     * 
     * @param vector
     * @param scalar
     * @return RowVector
     */
    private static RowVector scale(RowVector vector, double scalar) {

        if (scalar == 0) throw new IllegalArgumentException("Scalar cannot be zero");
        RowVector copy = vector.copy();
        for (int i = 0; i < copy.getDimension(); i++) {
            copy.setElement(i, copy.getElement(i) * scalar);
        }
        return copy;
    }

    /**
     * Swaps two RowVector objects in an array of RowVector objects
     * Elementary operation for Gaussian elimination
     * 
     * @param vectors
     * @param i
     * @param j
     */
    private static void swap (RowVector[] vectors, int i, int j) {

        RowVector temp = vectors[i];
        vectors[i] = vectors[j];
        vectors[j] = temp;
    }
}
