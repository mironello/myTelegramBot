package shapes;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void remove(Shape shape){
        shapes.remove(shape);
    }

    public void printShapeName(){
        for (Shape shape :
                shapes) {
            System.out.println(shape.getName());
        }
        
    }
}
