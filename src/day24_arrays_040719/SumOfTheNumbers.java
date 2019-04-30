package day24_arrays_040719;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		
		//let's create an array of integers with a length of 3
		
		int [] num = new int [5];
		//first value of array
		num[0] = 5;
		
		num[1] = 40;
		
		num[2] = 20;
		
		num[3] = 40;
		
		num[4] = 20;
		
		 Arrays.sort(num);
		    for(int i =0; i<num.length-3;i++){
		       if(num[i]!=num[i+2] || num[i+3]!=num[i+4]){
		         System.out.println(num[i]);
		       }
		       
		  }
		int single=0;
		  for(int i =0; i<num.length;i++){
		       single = single ^ num[i];
		  }
		  
		  System.out.println(single);
 		
		/*
		//[I@59f95c5d this is a hash code
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		
		int sum = 0;
		//use for loop, in order to loop through the array and calculate sum of all elements
		//numbers.length --> returns number of elements in the array
		
		int sum2=0;
		for(int i=0; i<num.length; i++) {
			sum2 +=num[i];
		}
	
	System.out.println(sum2);
	//find largest value in the array
	int max = Integer.MIN_VALUE;
	for(int i = 0; i<num.length;i++) {
		if(num[i]>max) {
			max = num[i];
		}
	}
	System.out.println("Max num:"+max);
	
	int min = Integer.MAX_VALUE;
	for(int i = 0; i<num.length;i++) {
		if(num[i]<min) {
			min = num[i];
		}
	}
		System.out.println("Min num:" + min);*/
	}
}
