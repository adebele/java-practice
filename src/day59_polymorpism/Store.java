package day59_polymorpism;

import java.util.*;
public class Store {

    public static void main(String[] args) {

        HairSpray hp = new HairSpray();
        hp.catchFire();

        Flammable hairSp = new HairSpray();
        hairSp.catchFire();

        //interface            implementing class/sub class
        Flammable pTank = new PropaneTank();
        pTank.catchFire();

        Flammable item;
        item  = new HairSpray();
        item = new PropaneTank();

        item.catchFire();

        List<Flammable> items = new ArrayList<>();

    }

}
