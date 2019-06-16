package day43_encapsulation_constructor;

public class Pet {
	private String name, type;
	
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public Pet() {
		System.out.println("No-Args constructor");
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Meow");
			break;
		case "dog":
			System.out.println("woof woof");
			break;
		case "bird":
			System.out.println("tweet");
			break;
		case "goat":
			System.out.println("mhaa mhaa");
			break;
		case "sheep":
			System.out.println("bhaa bhaa");
			break;
		case "rooster":
			System.out.println("u uruuu uuuu");
			break;
		default:
			System.out.println("...");
			break;
			
		}
	}
	
	@Override
	public String toString() {
		return "Pet [Name=" + name + ", Type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
