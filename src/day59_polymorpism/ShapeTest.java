package day59_polymorpism;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape triangle = new Triangle();
        triangle.draw();

        Shape square = new Square();
        square.draw();

    }
}
