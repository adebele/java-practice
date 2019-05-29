package day48_inheritance01;

public class Company {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Marufjon";
		emp1.jobTitle = "teacher";
		emp1.gender = 'm';
		emp1.age = 22;
		
		Employee emp2 = new Employee();
		emp2.name = "Keke";
		emp2.age = 26;
		emp2.gender = 'f';
		emp2.jobTitle = "Student relations";
		
		emp1.work();
		emp2.work();
		
		emp1.eat("chicken");
		emp2.eat("Salad");
		
		emp1.walk();
		emp2.walk();
	
		emp1.sleep(4);
		emp2.sleep(8);
		
		System.out.println(emp1.toString());
	}
}	
