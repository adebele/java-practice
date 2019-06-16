package day43_encapsulation_constructor;

public class Tesla {

	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	public boolean isValidModel(String model) {
		model = model.toLowerCase();
//		switch (model) {
//		case "model s":
//		case "model 3":
//		case "model x":
//		case "model y":
//		case "roadster":
//			return true;
//		default:
//			return false;
//		}

		return model.equals("model s") || model.equals("model 3") || model.equals("model x") || model.equals("model y")
				|| model.equals("roadster");
	}
	
	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		//call setter methods for each parameter
		//this.model = model;
		
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}
	
	
	

	public String getModel() {
		return model;
	}

	public int getRange() {
		return range;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public boolean getSelfDriving() {
		return selfDriving;
	}

	public void setModel(String model) {
		// call isValidModel here then assign it if true
		// if false: Invalid model - camry
		// assign "unknown" to model

		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid Model - " + model);
			this.model = "unknown";

		}
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	@Override
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

}
