package entities;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    private int perimetr;
    private double square;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        perimetr = (side1 + side2 + side3) / 2;
        double square = Math.sqrt(perimetr * (perimetr - side1) * (perimetr - side2) * (perimetr - side3));

    }

    @Override
    public java.lang.String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", perimetr=" + perimetr +
                ", square=" + square +
                '}';
    }
}

