package daniel;

public class ShapeDrawer extends Drawing<ShapeBasic> {

    public ShapeDrawer() {
    }

    public void draw() {

        if (getBasicShapes().isEmpty()) {
            System.out.println("Drawing is empty!");
        } else {
            for (int i = 0; i < getBasicShapes().size(); i++) {
                getBasicShapes().get(i).draw();
            }
            System.out.println("\n");   
        }
    }

    public void grow() {

        if (getBasicShapes().isEmpty()) {
            System.out.println("Drawing is empty!");
        } else {
            for (int i = 0; i < getBasicShapes().size(); i++) {
                getBasicShapes().get(i).grow();
            }
            System.out.println("\n");
        }
    }

    public void showVisibility() {

        if (getBasicShapes().isEmpty()) {
            System.out.println("Drawing is empty!");
        } else {
            for (int i = 0; i < getBasicShapes().size(); i++) {
                if (getBasicShapes().get(i).isVisible()) {
                    System.out.println(i + 1 + ". shape is visible: " + getBasicShapes().get(i).printText());
                } else if (!getBasicShapes().get(i).isVisible()) {
                    System.out.println(i + 1 + ". shape is in the background: " + getBasicShapes().get(i).printText());
                }

            }
            System.out.println("\nTotal number of shapes: " + getBasicShapes().size());
        }

    }

}
