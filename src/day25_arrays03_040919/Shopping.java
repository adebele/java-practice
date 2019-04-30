package day25_arrays03_040919;

public class Shopping {
	public static void main(String[] args) {

		String[] products = { "Shoes", "H&M Shirt", "Swatch watch watch", "Gucci Bag", "Addidas socks" };
		double[] prices = { 120.0, 5.99, 150.50, 3000.5, 6.99 };
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };

		// Print count of products:
		System.out.println("Products count: " + products.length);
		// check if products, prices and itemIds have same count

		if (products.length == prices.length && itemsId.length == products.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in this list");
		}

		System.out.println();
		// loop through products and print each one in a separate line
		for (String product : products) {
			System.out.println(product);
		}

		System.out.println();
		// prices --> for loop
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		System.out.println();
		// itemsId --> print this in reverse order using a loop
		for (int idx = itemsId.length - 1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
		}

		// print a report with a total price
		// Item 1: 12345 - Timberland Shoes - $120.0
		// ....
		// Total price:

		System.out.println();
		System.out.println("##########YOUR SHOPPING RECIEPT############\n");
		double totalPrice = 0.0;
		for (int idx = 0; idx < prices.length; idx++) {
			// int i = idx;
			System.out
					.println("Item " + (idx + 1) + ": " + itemsId[idx] + " - " + products[idx] + " - $" + prices[idx]);
			totalPrice += prices[idx];
		}
		System.out.println("\nTotal Price: $" + totalPrice);

		System.out.println();
		// Find the most expensive item in your list and print it as a report
		// Loop and find. Do not use Arrays class

		int maxIndex = 0;
		double maxPrice = 0;
		// 120.0, 5.99, 150.50, 3000.5, 6.99
		for (int j = 0; j < prices.length; j++) {
			
			if (prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}

		System.out.println("Item " + (maxIndex+1) + ": " + itemsId[maxIndex] + " - " + products[maxIndex] + " - " + maxPrice);

	}
}
