package day56_abstraction02;

public class Nokia extends MobilePhone{

	@Override
	public void text(String message) {
		System.out.println("Nokia seding msg: "+message);
		
	}

	@Override
	public void call() {
		System.out.println("Nokia is calling");
		
	}
	
	
	

}
