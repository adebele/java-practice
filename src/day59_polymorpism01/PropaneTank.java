package day59_polymorpism01;

public class PropaneTank implements Flammable {

    @Override
    public void catchFire(){
        System.out.println("Use caution: Propane tank might catch fire");
    }
}
