package daniel;

public class AdapterMain {
    public static void main(String[] args) {
        ShapeDrawer items = new ShapeDrawer();
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle();

        Circle cir = new Circle();
        Circle cir1 = new Circle();

        Rectangle rec2 = new Rectangle();
        rec.changeVisibility();
 
        Triangle tri = new Triangle("Other color");
        ShapeDiamond di = new ShapeDiamond("PURPLE");
        ShapeDiamond di1 = new ShapeDiamond("somethingElse");

        ShapeDiamond di2 = new ShapeDiamond(4.0, 4.0, "Yellow");
        Triangle tri1 = new Triangle(6.0, 6.0, 6.0, "Blue");
        ShapeDiamond di3 = new ShapeDiamond(1.0, 1.0, "Green");

        BrushStroke br = new BrushStroke();
        br.changeVisibility();

        BrushStroke br1 = new BrushStroke();
        br1.setColor("someColor");

        BrushStroke br2 = new BrushStroke();
        br2.setColor("RED");

        items.addBasicShape(rec);
        items.addBasicShape(rec1);
        items.addBasicShape(cir);
        items.addBasicShape(cir1);
        items.addBasicShape(rec2);
        

        ShapeAdapter shapeAdapter1 = new ShapeAdapter(di1);
        ShapeAdapter shapeAdapter2 = new ShapeAdapter(di2);
        ShapeAdapter shapeAdapter3 = new ShapeAdapter(tri1);
        ShapeAdapter shapeAdapter4 = new ShapeAdapter(tri);
        ShapeAdapter shapeAdapter5 = new ShapeAdapter(di);
        ShapeAdapter shapeAdapter6 = new ShapeAdapter(di3);
        

        shapeAdapter1.changeVisibility();
        shapeAdapter2.changeVisibility();
        shapeAdapter3.changeVisibility();

        items.addBasicShape(shapeAdapter4);
        items.addBasicShape(shapeAdapter5);
        items.addBasicShape(shapeAdapter1);
        items.addBasicShape(shapeAdapter2);
        items.addBasicShape(shapeAdapter3);
        items.addBasicShape(shapeAdapter6);

        items.addBasicShape(br);
        items.addBasicShape(br1);
        items.addBasicShape(br2);

        items.draw();
        items.grow();
        
        items.showVisibility();
        
        
    }
}
