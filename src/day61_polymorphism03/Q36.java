package day61_polymorphism03;

public class Q36 {
    private double length;
    private double height;
    private double area;

    public void setLenght(double length) {
        this.length=length;

    }


    public void setHeight(double height ) {

        this.height=height;

    }

    public void setArea() {

        area=length*height;

    }

    public static void main(String[] args) {
        Q36 obj= new Q36();
        //obj.setArea();
        obj.setHeight(6);
        obj.setLenght(5);
        obj.setArea();
        System.out.println(obj.area);
    }

}
