package day40_customclasses_method;

public class Employee {

	public String name; // can be used anywhere in project
	public String jobTitle; 
	double salary; // can only be used in same package
	
	
	 void work() {
		System.out.println(name+" is working hard...");
	}
	public void introduce() {
		System.out.println("Name["+name+"], JobTitle["+jobTitle+"], Salary["+salary+"]");
	}
	public void attendMeeting() {
		System.out.println(name+" is attending a meeting...");
	}
}
