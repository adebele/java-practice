package day31_methods03_042019;

public class Authentication {
/*
 * Name: login
 * Return type: void
 * 2 String args/params: username, password
 * Inside the method:
 * 	validUsername = "mentoring@cybertekschool.com
 * 	validPassword = "mentor001"
 * 
 * if username and password match, print "Login Successful! Welcome to Okta"
 * if not: "Sign in failed!"
 */
	public static void main(String[] args) {
		login("Mentoring@cybertekschool.com", "mentor001");
	}
public static void login(String userName, String password) {
	String validUsername = "mentoring@cybertekschool.com", validPassword = "mentor001";
	if(userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("Login Successful! Welcome to Okta");
	}else {
		System.out.println("Sign in failed!");
	}
	
}


}
