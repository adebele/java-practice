package day40_customclasses_method;

public class bestBuy {
		
	public static void main(String[] args) {
		//System.out.println(brand);
		//Above line will not work, we need object to use brand
		//Create CellPhone object
		CellPhone  cell1 = new CellPhone();
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;
		
		System.out.println("Brand: "+ cell1.brand);
		System.out.println("screenSize: "+cell1.screenSize);
		System.out.println("Color: "+cell1.color);
		System.out.println("Price: "+cell1.price);
		
		CellPhone cell2 = new CellPhone();
		
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println("Brand: "+ cell2.brand);
		System.out.println("screenSize: "+cell2.screenSize);
		System.out.println("Color: "+cell2.color);
		System.out.println("Price: "+cell2.price);
		
		System.out.println("### CALLING METHODS ###");
		cell1.call();
		cell1.message();
		
	}
}
