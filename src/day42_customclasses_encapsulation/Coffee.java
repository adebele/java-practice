package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase()+"  "+size.toUpperCase()+" $" +price+" "+calories+" CAL";
		System.out.println(info);
	}
}