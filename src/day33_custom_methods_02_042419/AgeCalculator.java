package day33_custom_methods_02_042419;

public class AgeCalculator {
	public static void main(String[] args) {
		
		int age = calculateAge(1996);
		//System.out.println(calculateAge(1996));
		//System.out.println(age);
	}
	
	
	public static int calculateAge (int year) {
		if(year>2019) {
			System.out.println("Invlaid entry");
			return -1;
		}
		int age = 2019-year;
		if(age>=1&&age<=14) {
			System.out.print("Child ");
		}else if(age>=15&&age<=25) {
			System.out.print("Youngster ");
		}else if(age>=26&&age<=64) {
			System.out.print("Adult ");
		}else if(age>=65) {
			System.out.print("Senior ");
		}
		return age;
	}
}
