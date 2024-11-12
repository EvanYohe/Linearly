package com.linearly.model;

public class Dimension {

    private int rows;
    private int cols;

    public Dimension() {
        this.rows = 0;
        this.cols = 0;
    }

    public Dimension(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    
}
