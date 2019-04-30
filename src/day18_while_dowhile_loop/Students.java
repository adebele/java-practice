package day18_while_dowhile_loop;

public class Students {

	public static void main(String[] args) {

		int numberOfStudents = 1;
		// using a loop, iterate until we have 10 students

		while (numberOfStudents <= 10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}
		System.out.println("No more space.");

	}

}
