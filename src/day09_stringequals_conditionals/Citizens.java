package day09_stringequals_conditionals;

import java.util.*;

public class Citizens {
//Replit question 32
	
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE 
	    
	    int seniorCitizens, nonSeniorCitizens, age;
	    
	    Scanner scan = new Scanner (System.in);
	    
	    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
	    
	    seniorCitizens = scan.nextInt();
	    nonSeniorCitizens = scan.nextInt();
	    
	    System.out.println("What is new citizen's age?");
	    
	    age = scan.nextInt();
	    
	    
	    if(age>=65){
	      System.out.println("Senior Citizen");
	      System.out.println("New seniorCitizens count "+ ++seniorCitizens);
	      System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizens);
	      
	    }else {
	      System.out.println("Non-Senior Citizen");
	      System.out.println("New seniorCitizens count "+ seniorCitizens);
	      System.out.println("New nonSeniorCitizens count "+ ++nonSeniorCitizens);
	    }
	    
	  }
}
