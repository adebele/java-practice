package day50_inheritance03;

public class FullTimeEmployee extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {
		//should include 5% bonus
		System.out.println("Employee total pay: " + (hours * rate * 1.05));
	
		
	}
	
}
