package daniel;

import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {

    private final int thickness;
    private String color = "Yellow";

    public BrushStroke() {
        Random random = new Random();
        thickness = random.nextInt(10) + 1;
    }

    @Override
    public void draw() {
        System.out.println("Brush strokes with thickness " + thickness);
    }

    @Override
    public void grow() {
        System.out.println("Adding some color..." + getColor());
    }

    @Override
    public String printText() {
        return "Brush Stroke";
    }

    @Override
    public String getColor() {
        if (color == "No color") {
            return "Out of color...";
        } else
            return color;
    }

    @Override
    public String setColor(String color) {
        return CanBeColored.super.setColor(color);
    }

}
