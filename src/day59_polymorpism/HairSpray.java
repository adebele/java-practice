package day59_polymorpism;

public class HairSpray implements Flammable {

    @Override
    public void catchFire() {
        System.out.println("Use caution: Hair Spray might catch fire");
    }
}
