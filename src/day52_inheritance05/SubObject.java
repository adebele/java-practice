package day52_inheritance05;

public class SubObject {
	
	//cant override with a different method signature
//	public void toString() {
//	}
	
	public String toString() {
		return "";
	}
	
	public static void main(String[] args) {
		SubObject sb = new SubObject();
		sb.toString();
	}

}
