package day24_arrays_040719;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}

		String str = "Wooden spoon";
		// this, method toCharArray() converts string into array of characters
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c + "_");
		}
		str = "";
		System.out.println();
		for (int i = chars.length - 1; i >= 0; i--) {
			// System.out.print(chars[i]+"_");
			str += chars[i];

		}
			System.out.println(str);	
		
			
			System.out.println();
		//TASK
		//print characters with help of array of characters, one by one 
		//if character is equals to 'o', replace with '*';
		str = "";
			for (char c: chars) {
				if(c=='o') {
					c='*';
				}
				str+=c;
			}
			System.out.println(str);
	
			System.out.println();
			char[] newChars = new char[3];
			System.out.println("Vlaue of char: "+newChars[0]);
			System.out.println(newChars);
			
			
			
	}

}
