package daniel;

public class ShapeAdapter extends Visibility implements ShapeBasic{
    private ShapeSpecial shapeSpecial;


    public ShapeAdapter(ShapeSpecial shapeSpecial) {
        this.shapeSpecial = shapeSpecial;
    }

    @Override
    public void draw() {
        shapeSpecial.drawShape();
    }

    @Override
    public void grow() {
        System.out.println(printText() + ", cannot grow");
    }

    @Override
    public String printText() {
        if (shapeSpecial instanceof Triangle) {
            return "Triangle";
        } else if (shapeSpecial instanceof ShapeDiamond) {
            return "ShapeDiamond";
        } else 
        return "This shape is not supported";
    }
    
}
