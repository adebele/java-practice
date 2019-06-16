package day56_abstraction02;

public abstract class MobilePhone extends Phone{
	//does not need to override call since it is not concrete class
	
	//static methods can not be abstract
	public abstract void text(String message);
	

}
