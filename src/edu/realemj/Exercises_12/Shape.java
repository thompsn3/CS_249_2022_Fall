package edu.realemj.Exercises_12;

import edu.realemj.Exercises_09.Matrix2D;

public class Shape {
    private boolean filled = false;
    private Matrix2D center = Matrix2D.makePoint2D(0,0);

    public Shape() {}

    public Shape(boolean filled, Matrix2D center) {
        this.filled = filled;
        this.center = new Matrix2D(center);
    }

    public boolean isFilled() { return filled; }
    public Matrix2D getCenter() { return new Matrix2D(center); }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setCenter(Matrix2D center) {
        this.center = new Matrix2D(center);
    }    
}
