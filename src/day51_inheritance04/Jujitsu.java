package day51_inheritance04;

public class Jujitsu extends Exercise {

	public int perform(int minutes) {
		System.out.println("Doing Jujitsu");
		return minutes*12;
	}
}
