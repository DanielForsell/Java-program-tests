package daniel;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {

    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle() {
    }

    public Triangle(String color) {
        this.color = setColor(color);
    }

    public Triangle(double a, double b, double c) {
        if (a >= 3.0) {
            this.a = a;
        }
        if (b >= 3.0) {
            this.b = b;
        }
        if (c >= 3.0) {
            this.c = c;
        }

    }

    public Triangle(double a, double b, double c, String color) {
        if (a >= 3.0) {
            this.a = a;
        }
        if (b >= 3.0) {
            this.b = b;
        }
        if (c >= 3.0) {
            this.c = c;
        }

        this.color = setColor(color);
    }

    public double calculateArea() {
        double p = (a + b + c) / 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calculatePerimeter() {
        return (a + b + c);
    }

    public void drawShape() {

        System.out.println("This is a triangle with area: " + df2.format(calculateArea()) + " and the perimeter: " + df2.format(calculatePerimeter())
                + " Color: " + color);
    }

    @Override
    public String setColor(String color) {
        return CanBeColored.super.setColor(color);
    }

    @Override
    public String getColor() {
        if (color == "No color") {
            return "The shape is not colored";
        } else
            return color;
    }

}
