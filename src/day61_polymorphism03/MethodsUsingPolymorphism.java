package day61_polymorphism03;

import day49_inheritance02.TV;
import day57_interface.Tesla;
import day60_polymorphism02.*;
import java.util.*;

public class MethodsUsingPolymorphism {

    public static void main(String[] args) {

        purchase(new Mac());

        AppleDevice dev = new AppleWatch();

        purchase(dev);

        givemeAnyObject(new String ("hi"));
        givemeAnyObject(new Scanner(System.in));
        givemeAnyObject(new TV());
        givemeAnyObject(new Tesla());
        givemeAnyObject(55); //auto boxing to Integer
        givemeAnyObject(new Integer (55));
        int n = 33;
        givemeAnyObject(n);

    }
    //Method buildAppleDevice, return type: AppleDevice

    public static AppleDevice buildAppleDevice(){
        AppleDevice ap = new AppleWatch();
        return ap;
    }

    public static void purchase(AppleDevice ap){
        System.out.println("Purchsaing: "+ap.getClass().getSimpleName());
    }
    public static void givemeAnyObject(Object object){
        System.out.println("You gave me: "+object.getClass().getSimpleName());
    }




}
