package day38_arraylist03;


import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(56.23);
		list.add(true);
		list.add(false);
		
		System.out.println(list);//automatically call toString()

		String str = list.get(4).toString();
		System.out.println(str);
		Integer i = (Integer) list.get(2);//Downsizing
		
		//All values are stored as a raw type, we can also call it as a general object type
	
	
	
	
	}
}
