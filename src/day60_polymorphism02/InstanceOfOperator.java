package day60_polymorphism02;

import day59_polymorpism01.*;
public class InstanceOfOperator {

    public static void main(String[] args) {

        Shape shape = new Triangle();
        //getClass().getName() method
        System.out.println(shape.getClass().getName());
        System.out.println(shape.getClass().getSimpleName());


        if(shape.getClass().getSimpleName().equals("Triangle") ){
            System.out.println("It is a Triangle!");
        }else if(shape.getClass().getSimpleName().equals("Circle")){
            System.out.println("It is a circle!");
        }else if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a square!");
        }

        //same check using instanceOf operator

        System.out.println(shape instanceof Square);
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Triangle);

        System.out.println(shape instanceof Shape);
        System.out.println(shape instanceof Object);

        System.out.println("\n");
        if(shape instanceof Triangle){
            System.out.println("It is a Triangle!");
        }

        Shape[] shapes = {new Triangle(), new Square (), new Circle(), new Triangle(), new Square(), new Circle()};

        int circles = 0, squares = 0, triangles = 0;
        //using for each loop find our number of each type

        for(Shape sh: shapes){
            if(sh instanceof Triangle){
                triangles++;
            }if(sh instanceof Circle){
                circles++;
            }if(sh instanceof Square){
                squares++;
            }

        }

        System.out.println("Triangle: "+triangles+"\nCircle: "+circles+"\nSquare: "+squares);

    }

}

