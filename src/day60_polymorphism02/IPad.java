package day60_polymorphism02;

public class IPad extends AppleDevice{
    @Override
    public void use(){
        System.out.println("IPad | Music | Read Book | Cartoon");
    }

    public void draw(){
        System.out.println("Drawing on IPad");
    }
}
