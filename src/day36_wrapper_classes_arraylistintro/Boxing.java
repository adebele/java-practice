package day36_wrapper_classes_arraylistintro;

public class Boxing {
	public static void main(String[] args) {
		//AUTOBOXING 
		//Process of converting a primitive data type to (a)an (Wrapper Class) object
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		//Unboxing - converting object into primitive
		//convert wrapper class object into primitive
		Double d1 = new Double(34.2);
		double d2 = d1;
		
		long l1 = new Long(600000); //unboxing
		Long l2 = new Long(345323L);//creating an object
		long l3 = l2; //unboxing
		Long l4 = l3; //Autoboxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; 
		Double d3 = (double)num3;
		
		
	}
}
