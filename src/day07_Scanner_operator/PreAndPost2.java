package day07_Scanner_operator;

public class PreAndPost2 {

	public static void main(String[] args) {

		int messages = 10;
		messages++;
		++messages;

		System.out.println("Messages: " + messages);

		int readMessages = --messages;

		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);

		int unreadMessages = readMessages--;

		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("ReadMessages: " + readMessages);

		int total = unreadMessages++ - readMessages--;

		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("total: " + total);

		int count = 20;
		int count2 = 10;

		
		int totalCount = ++count + --count2;
		System.out.println("Count: " + count);
		System.out.println("Count2: " + count2);
		System.out.println("Total: " + totalCount);

		
		int myCount = count++ + ++count;
		System.out.println("Count: "+count);
		System.out.println("MyCount: "+myCount);
		
		
		
	}

}
