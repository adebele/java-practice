package day30_methods02_041719;

public class StudentsV2 {

	public static void main(String[] args) {
		study("Html");
		study("Selenium");
		sleep(4);
	}

	public static void study(String topic) {
		System.out.println("Student is studying " + topic);

	}
	
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours.");
	}

}
