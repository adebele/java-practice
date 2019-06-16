package day60_polymorphism;

import java.util.*;
import day59_polymorpism.Circle;
import day59_polymorpism.Shape;
import day59_polymorpism.Square;
import day59_polymorpism.Triangle;

public class ShapesArray {
    public static void main(String[] args){


        Shape shape = new Triangle();
        shape.draw(); //overriden version of draw is called

        Shape[] shapes = {new Triangle(), new Square(), new Circle(),
                            new Triangle(), new Square(), new Circle()};

        Shape[] shapes2 = new Shape[3];
        shapes2[0] = new Triangle();
        shapes2[1] = new Square();
        shapes2[2] = new Circle();

        shapes[0].draw();
        shapes[2].draw();

        System.out.println("### FOR EACH LOOP ###\n");


        for(Shape sh : shapes) {
            System.out.println(sh.getClass().getSimpleName());
            sh.draw();
        }

            List<Shape> shapesList = new ArrayList<>();
            shapesList.add(new Circle());
            shapesList.add(new Triangle());
            shapesList.add(new Circle());
            shapesList.add(new Triangle());
            shapesList.add(new Square());
            shapesList.add(new Triangle());

            shapesList.get(0).draw();
            //Shape some

            System.out.println("### FOR EACH WITH LIST OF SHAPES\n");

            for(Shape shapeItem: shapesList){
                System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
                //shapeItem.draw();
            }

            System.out.println("\n\n");

            for(int i=0;i<shapesList.size();i++){
                Shape tempSh = shapesList.get(i);
                System.out.println(tempSh.getClass().getSimpleName().toUpperCase());
            }




    }
}
