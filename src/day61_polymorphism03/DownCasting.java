package day61_polymorphism03;

import day60_polymorphism02.AppleDevice;
import day60_polymorphism02.*;

public class DownCasting {
    public static void main(String[] args) {
        AppleDevice appDev = new IPad();
        //appDev can access use method, startingPrice variable
        appDev.use();
        //appDev.draw(); not accessible
        //how to call draw method from IPad

        IPad ipad = (IPad) appDev;
        ipad.use();
        ipad.draw();

        AppleDevice dev2 = new Mac();
        dev2.use();

        //1. using another reference variable

        Mac mac = (Mac)dev2;
        mac.code();
        System.out.println(mac.model);
        //2. cast and call in single statment
        ((Mac)dev2).code();







    }
}
