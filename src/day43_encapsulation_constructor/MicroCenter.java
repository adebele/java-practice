package day43_encapsulation_constructor;

public class MicroCenter {
	public static void main(String[] args) {

		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		comp1.setBrand("Lenovo");
		comp1.setOs("Windows 10");
		comp1.setPrice(650);
		
		comp2.setBrand("iMac");
		comp2.setOs("macOS High Sierra");
		comp2.setPrice(2567);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		Computer comp3 = new Computer ("ASUS", "Windows 7", 645.5);
		System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11");
		
		System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice()-200);
		System.out.println(comp3.toString());
	
		
	}
}
