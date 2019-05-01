package day36_wrapper_classes_arraylistintro;

public class WrapperClass {
	
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = new Integer(20);
		System.out.println(n1);
		System.out.println(n2);
	
	
		double d1 = 44.5;
		Double d2 = new Double(123.1);
		Double d3 = new Double("5.2");
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d3+d2+d1);
		
		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)10);
		Byte b3 = new Byte ("-55");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b3+b2+b1);
		
		Integer num1 = Integer.valueOf(1234);
		Byte b4 = Byte.valueOf((byte)56);
		Boolean bool2 = Boolean.valueOf(true);
		Boolean bool1 = Boolean.valueOf("true");
		System.out.println(bool1);
		
		Integer i = 1234; //new Integer(1234); ->it'll internally be converted to an object
		
		
	
	
	}
	
}
