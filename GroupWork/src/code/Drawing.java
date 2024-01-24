package daniel;

import java.util.ArrayList;
import java.util.List;

public abstract class Drawing<T> {
    private List<T> shapes = new ArrayList<>();

    public Drawing() {
    }
    
    public void addBasicShape(T element) {
        if (element != null) {
            shapes.add(element);
        }
    }

    public List<T> getBasicShapes() {

        return shapes;
    }

    abstract void draw();

}
