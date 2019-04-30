package day13_ternary_strings_intro;

public class MoreTernary {
	
	public static void main (String [] args) {
		
		
		byte n1 = 0;
		
		
		String quality = "bad";
		
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating: "+ rating);
		
		int PMhour = 6;
		//Rush hour during evening: 4 - 7
		
		boolean rushHour = (PMhour>=4 && PMhour<=7) ? true : false;
		System.out.println(rushHour);
	
		String result = (rushHour)? "yes": "no";
		System.out.println(result);
		
		int amHour =10; //6-9
		//6-9 amRushHour - Yes, NO
		String amRushHour;
		
		amRushHour = (amHour>=6 && amHour<=9)? "Yes":"No";
		
		
		
		System.out.println(amHour +" is rush hour? - "+amRushHour);
		
	}
}
