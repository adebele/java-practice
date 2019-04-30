package day33_custom_methods_02_042419;

public class WarmUp {

	public static void main(String[] args) {
		addVoid(4, 6);
		
		add(4, 6);
		int result = add(6,2);
		System.out.println(add(6,2));//these lines print a value because the method returns a value.
		
		
		
		//the below lines won't work bc the method does not return any value, 
		//it only prints inside the method.
		//int result = addVoid(4,6);
		//System.out.println(addVoid(4,6)
	}

	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;

		System.out.println(sum);
	}

	public static int add(int num1, int num2) {

		int sum = num1 + num2;

		return sum;
	}
	
	
	
	
	
	
	
	
}
