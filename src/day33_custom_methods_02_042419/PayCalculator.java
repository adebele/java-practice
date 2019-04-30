package day33_custom_methods_02_042419;

public class PayCalculator {
	
	public static void main(String[] args) {
		int noPay = getHourlyPay(10,0);
		System.out.println("noPay: "+noPay);
		
		System.out.println("Total pay this week: "+getHourlyPay(40, 15));
	}
	
	
	public static int getHourlyPay(int hours, int rate) {
		
		if (hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
			
		}if (rate <= 0) {
			System.out.println("Invalid rate");
			return 0;

		} 
		int totalPay = hours * rate;
			return totalPay;
		

	}
}
