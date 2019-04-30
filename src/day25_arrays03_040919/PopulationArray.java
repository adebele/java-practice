package day25_arrays03_040919;

public class PopulationArray {

	public static void main(String[] args) {

		int[] populations = { 23000, 4020123, 1231212, 900000, 190000 };

		int[] populations2 = new int[5];
		populations2[0] = 5000;
		populations2[1] = 10000;
		populations2[2] = 7000;
		populations2[3] = 8907;
		populations2[4] = 4455;

		// int[] population = new int[] {5000, 10000, 7000, 4455, 8907};

		for (int i = 0; i < populations.length; i++) {
			System.out.println("City " + i + " population : " + populations[i]);
		}

		System.out.println();
		System.out.println();

		int i = 0;
		for (int num : populations) {
			System.out.println("City " + i++ + " population: " + num);
		}
		System.out.println();
		String str = "abc";
		System.out.println("City STR.LENGTH() population : " + populations[str.length()]);
		
		//String array called cities = "Miami", "London", "Tokyo", "Rome", "New York"
		
		String[] cities= {"Miami", "London", "Tokyo", "Rome", "New York"};
		
		//Population of Miami is 23000
		//Population of London is 4020123
		//Population of Tokyo is 1231212
		//Population of Rome is 900000
		//Population of New York is 190000
		
		System.out.println("Population of "+cities[0]+" is "+populations[0]);
		System.out.println("Population of "+cities[1]+" is "+populations[1]);
		System.out.println("Population of "+cities[2]+" is "+populations[2]);
		System.out.println("Population of "+cities[3]+" is "+populations[3]);
		System.out.println("Population of "+cities[4]+" is "+populations[4]);
		
		

	}

}
