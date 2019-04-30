package day27_Arrays_041319;

public class CanvasCourses {

	public static void main(String[] args) {

		String url = "https://learn.cybertekschool.com/courses/149";

		String[] urlArray = url.split("/");

		/*
		 * 147 -> Java programming 
		 * 204 -> Mentoring sessions 
		 * 149 -> SDLC 
		 * 152 -> QA Testing 
		 * 144 -> Team activity 
		 * 143 -> Welcome Kit
		 */

		int courseID = Integer.parseInt(urlArray[urlArray.length - 1]);

		switch (courseID) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA testing");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid course");
			break;
		}

	}

}
