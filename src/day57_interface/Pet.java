package day57_interface;

public interface Pet {
	boolean FRIENDLY = true; //automatically assigned public, static, final
	
	void keepAsPet(); //automatically assigned public abstract for methods
	
	public default void play() {
		System.out.println("Playing hide and seek with a pet");
	}
	
	
	public static void feed(String food) {
		System.out.println("Feeding a pet "+food);
	}
}
