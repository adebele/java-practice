package day51_inheritance04;

public class Sprinting extends Running {
	public int perform(int minutes) {
		System.out.println("Doing general exercise");
		return minutes * 4;
	}
	
}
