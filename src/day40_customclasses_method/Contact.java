package day40_customclasses_method;

public class Contact {

	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("Calling " + name+"... ");
	}

	public void sendMessage() {
		System.out.println("Send message to: " + phoneNumber);
	}

	public void sendEmail() {
		System.out.println("Send email to: " + email);
	}
}
