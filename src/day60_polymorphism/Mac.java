package day60_polymorphism;

public class Mac extends AppleDevice{

    public String model = "mac computer";
    @Override
    public void use(){
        System.out.println("Mac | Computer | Code | Read Book | Email");
    }

    public void code() {
        System.out.println("Coding on Mac");
    }



}
