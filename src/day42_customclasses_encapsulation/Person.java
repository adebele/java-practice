package day42_customclasses_encapsulation;

public class Person {
	
		
		//declare name and age encapsulated data
		private String name;
		private int age;
		
	//public getter and setter method 
	//read only
		
		public String getName() {
			return name;
		}
		
	//write only - void
	public void setName(String name) {
		this.name = name; 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
