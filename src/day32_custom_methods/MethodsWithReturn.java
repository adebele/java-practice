package day32_custom_methods;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: "+i);
		System.out.println(name());
	}

	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}
	
	public static String name() {
		String name = "Abiy";
		return name;
	}
	
	
	
}
