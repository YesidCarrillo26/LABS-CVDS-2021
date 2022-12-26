package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        Shape shape;
        switch(type){
            case Hexagon:
                shape = new Hexagon();
                break;
            case Pentagon:
                shape = new Pentagon();
                break;
            case Triangle:
                shape = new Triangle();
                break;
            case Quadrilateral:
                shape = new Quadrilateral();
                break;
            default:
                shape = null;
        }
        return shape;
    }

}
