package day40_customclasses_method;

public class MyContacts {
	public static void main(String[] args) {
		
		//create contact object
		Contact Evgenia= new Contact();
		Evgenia.name = "Evgenia Jalilova";
		Evgenia.phoneNumber = "(202) 333-4444";
		Evgenia.email = "Evgenia@thorlabs.com";
		
		
		Evgenia.call();
		Evgenia.sendMessage();
		Evgenia.sendEmail();
		
		Contact orhan = new Contact();
		orhan.name ="Orhan Sultanov";
		orhan.phoneNumber = "(571) 991-3322";
		orhan.email = "orhan@google.com";
	
		System.out.println("\nName: "+orhan.name);
		System.out.println("PhoneNumber: "+ orhan.phoneNumber);
		System.out.println("Email: "+orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
	}
}
