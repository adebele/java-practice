package day32_custom_methods;

public class Cooking {
	public static void main(String[] args) {
		makePancakes();	
		makePasta();
		makePancakes();	
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~"+ dish.toUpperCase()+" RECIPE~~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~~"+ dish.toUpperCase()+" IS READY!~~~");
	}
	public static void makePasta() {
		System.out.println("~~~ITALIAN PASTA RECIPE~~~");
		add("Water, Salt, Olive oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~~DELICIOUS PASTA IS READY~~~~");
	}
	public static void makePancakes() {
		System.out.println("~~~~~PANCAKE RECIPE~~~~~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~Enjoy Pancakes~~~");
	}

	public static void add(String ingredient) {
		// TODO Auto-generated method stub
		System.out.println("Add " + ingredient);
	}

	public static void mix(int sec) {
		// TODO Auto-generated method stub
		System.out.println("Mix for " + sec + " seconds.");
	}

	public static void fry(int min) {
		System.out.println("Fry for " + min + " minutes.");
	}

	public static void boil(int min) {
		System.out.println("Boil for " + min + " minutes");
	}
}
