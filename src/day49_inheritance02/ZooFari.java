package day49_inheritance02;

public class ZooFari {

	public static void main(String[] args) {
		Leopard leo = new Leopard();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Leopard zeus = new Leopard("Zeus");
		System.out.println(zeus.getType());
		
	}
}
