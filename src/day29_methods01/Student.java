package day29_methods01;

public class Student {
	public static void main(String[] args) {
//		sayHello();
//		study();
//		study();
//		code();

		System.out.println(countLetters("aaabbbccc"));
	
	
	}
	public static String countLetters(String str){
		String countStr="", check="";


		for(int i=0;i<str.length();i++){
			int count=0;
			String ch=str.charAt(i)+"";

			for(int j=0;j<str.length();j++){

				if(str.charAt(i)==(str.charAt(j)) && (!check.contains(ch))){
					count++;
				}
			}
			if(!check.contains(ch)){
				check=count+""+str.charAt(i);
				countStr+=check;
			}
		}
		return countStr.trim();
	}

	public static void study() {
		System.out.println("Student is studying.");

	}

	public static void sayHello()

	{
		System.out.println("Hello friends!");
		System.out.println("How are you?");
	}

	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}

}
