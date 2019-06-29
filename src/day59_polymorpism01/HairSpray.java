package day59_polymorpism01;

public class HairSpray implements Flammable {

    @Override
    public void catchFire() {
        System.out.println("Use caution: Hair Spray might catch fire");
    }
}
