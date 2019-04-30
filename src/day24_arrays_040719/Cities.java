package day24_arrays_040719;

public class Cities {
	public static void main(String[] args) {
		String[] cities = { "Washington D.C.", "Kiev", "Moscow", "Annandale", "Istanbul", "Baku", "Miami", "McLean" };
		System.out.println(cities.length);

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		System.out.println("\n");
		// for(DateTypeOfArray tempVariableName:arrayName) {}
		for (String city : cities) {
			if (city.startsWith("M")) {
				System.out.println(city);
				
			}
		}

		
		
		
	}
}
