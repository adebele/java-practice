package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {

		boolean isBreakTime = true;
		//if(isBreakTime == true) => this statement is not needed because the if statement would run the command 
		// as a boolean statement
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
		
		boolean classTime = true;
		
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Code and have fun!");
		}
		
		boolean qualified = false;
		//send a notification message only if not qualified
		//we need to check if qualified variable contains FALSE
		
		if (qualified == false) {
			System.out.println("You application was not approved. Thank you");
		}
		
	}

}
