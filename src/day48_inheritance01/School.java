package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Obama";
		person.age = 57;
		person.gender = 'm';
		
		student.name = "Roman";
		student.age = 30;
		student.gender = 'm';
		student.clazz = "coding";
		
		person.eat("steak");
		student.eat("b7 burger");
		
		person.walk();
		student.walk();
		
		person.sleep(8);
		student.sleep(6);
		
		Student student2=new Student();
		student2.name= "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		student2.clazz = "Scrum master";
		student2.code("Java");
		student2.eat("kebab");
		student2.walk();
		
	}
}
