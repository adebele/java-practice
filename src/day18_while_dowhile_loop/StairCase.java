package day18_while_dowhile_loop;

public class StairCase {
	public static void main(String[] args) {
		String star = "";
		
		int x = 0;
		while(x<=10) {
			star +="* * * ";
			System.out.println(star);
			x+=1;
		}
		
	}
}
