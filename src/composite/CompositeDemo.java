package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * cmbine/use singular or multiple return types in common apis
 */

class GraphicObject {
    protected String name = "Group";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GraphicObject() {

    }

    public String color;
    public List<GraphicObject> children = new ArrayList<>(); // could be single object or group of objects

    @Override
    public String toString() {
        return "GraphicObject{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", children=" + children +
                '}';
    }
}
public class CompositeDemo {
}
