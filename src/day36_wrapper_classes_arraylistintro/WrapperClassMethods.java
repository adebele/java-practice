package day36_wrapper_classes_arraylistintro;

public class WrapperClassMethods {
	public static void main(String[] args) {

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);

		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		//convert string to primitive
		int count = Integer.parseInt("2344");
		System.out.println("count: "+count);
		
		int count2 = Integer.valueOf("564");
		System.out.println("count: "+count2);
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('1'));
		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('p'));
		
		System.out.println();
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit(str.charAt(6)));
		
		String word = "ab123c5dfer1";
		
		System.out.println();
		for(int i=0; i<word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				System.out.print(word.charAt(i));
			}
		}
		
		
		
		

	}
}
