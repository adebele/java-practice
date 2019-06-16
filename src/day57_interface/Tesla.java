package day57_interface;

public class Tesla implements Electric, Autonomous{

	public void charge() {
		System.out.println("Tesla is supercharging");
	}
	
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode");
	}
}
