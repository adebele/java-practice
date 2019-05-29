package day51_inheritance04;

public class Yoga extends Exercise {
	public int perform(int minutes) {
		System.out.println("Doing Yoga");
		return minutes*5;
	}
}
