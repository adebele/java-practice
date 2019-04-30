package day33_custom_methods_02_042419;

import day31_methods03_042019.Calculator;

public class CalcTests {
public static void main(String[] args) {
	System.out.println(CalculatorWithMethods.add(3, 1));
	System.out.println(CalculatorWithMethods.multiply(5, 2));
	System.out.println(CalculatorWithMethods.minus(3, 6));
	System.out.println(CalculatorWithMethods.divide(30, 12));
	
	
	double dResult = CalculatorWithMethods.divide(455,5);
	
	
	double a = 10.0, b = 5.0;
	double myResult = CalculatorWithMethods.minus(a, b);
	System.out.println("myResult: "+myResult);
	
	double[] dNums = {2.0, 4.0};
	double result2 = CalculatorWithMethods.multiply(dNums[0], dNums[1]);
	System.out.println("result2: "+result2);
	
	if(CalculatorWithMethods.add(10, 16)==26) {
		System.out.println("Add Unit Test Passed");
	}else {
		System.out.println("Add Unit Test failed");
	}
	
}
}
