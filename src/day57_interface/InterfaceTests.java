package day57_interface;

public class InterfaceTests {
	public static void main(String[] args) {
		
		//Electric el = new Electric();
		//cannot instantiate an object from an interface class
		
		Tesla t = new Tesla();
		BMWi8 i8 = new BMWi8();
		
		t.charge();
		i8.charge();
		
		//t.drive();
		t.selfDrive();
		
		Cat cat = new Cat();
		cat.keepAsPet();
		//cat.feed();
		
		
	}
}
