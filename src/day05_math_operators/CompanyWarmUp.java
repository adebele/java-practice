package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {

		String companyName, address;
		int numberOfEmployees;
		long revenue;
		boolean isTechCompany;

		companyName = "Facebook";
		address = "Silicon Vally, CA";
		numberOfEmployees = 1000;
		revenue = 4000000L;
		isTechCompany = true;

		System.out.println("Company  " + companyName + " is located in  " + address + ". They have " + numberOfEmployees
				+ " number of employees and have a revenue of " + revenue + ". Is " + companyName + " a tech company?: "
				+ isTechCompany);

		System.out.println("\n");
		
		String aboutCompany = companyName + " is one of the most profitable companies in the world.";

		System.out.println(aboutCompany);

	}
}
