package day27_Arrays_041319;

public class Testing {

	public static void main(String[] args) {

		/*
		 * Java --> programming language 
		 * Selenium --> Test Automation 
		 * TestNG --> Unit Tests 
		 * JUnit --> Unit Tests 
		 * Cucumber --> BDD Style testing 
		 * Git --> Version control 
		 * Maven --> Building and execution for project 
		 */
		 
	
		
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		
		for(String tool: tools) {
			switch(tool.toLowerCase()) {
			case "java":
				System.out.println(tool+" - Programming language");
				break;
			case "selenium":
				System.out.println(tool+" - Test Automation");
				break;
			case "testNG":
				System.out.println(tool+" - Unit Tests");
				break;
			case "junit":
				System.out.println(tool+" - Unit Tests");
				break;
			case "cucumber":
				System.out.println(tool+" - BDD Style testing");
				break;
			case "git":
				System.out.println(tool+" - Version control");
				break;
			case "maven":
				System.out.println(tool+" - Building and execution for project");
				break;
			default:
				System.out.println("Unknown Tool");
				break;
			}
		}
		

	}

}
