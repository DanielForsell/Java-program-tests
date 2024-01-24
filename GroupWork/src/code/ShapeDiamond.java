package daniel;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {

    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond() {
    }

    public ShapeDiamond(String color) {
        this. color = setColor(color);
    }
    
    public ShapeDiamond(double a, double b) {
        if (a >= 2.0) {
            this.a = a;
        }
        if (b >= 2.0) {
            this.b = b;
        }
    }

    public ShapeDiamond(double a, double b, String color) {
        if (a >= 2.0) {
            this.a = a;
        }
        if (b >= 2.0) {
            this.b = b;
        }
        this.color = setColor(color);
    }

    
    @Override
    public double calculateArea() {
        return ((a * b));
    }

    @Override
    public double calculatePerimeter() {
        return (2*a) + (2*b);
    }

    @Override
    public void drawShape() {
        System.out.println("This is a diamond shape with area: "+ df2.format(calculateArea()) + " and perimeter: " + df2.format(calculatePerimeter()) + " Color: " + getColor());
    }

    public String setColor(String col) {
        return CanBeColored.super.setColor(col);
    }

    @Override
    public String getColor() {
        if (color == "No color") {
            return "The shape is not colored";
        } else
        return color;
    }
    
}
