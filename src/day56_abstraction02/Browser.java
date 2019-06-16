package day56_abstraction02;

public abstract class Browser {
	
	String name;
	static int id;
	
	public Browser() {
		System.out.println("Creating a Browser");
	}
	
	public Browser(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();

	public void close() {
		System.out.println("Exiting the browser.");
	}
	
	

}