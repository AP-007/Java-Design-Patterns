
public class Car {
	//The class has only private constructors and NO Setter methods. So that ONLY the builder class can create an object of it.
	
	//Mandatory Properties
	private String color;
	private short bhp;
	private short cc;
	
	
	//Optional Properties
	private String turbo;
	private String selfDriving;
	
	
	// Getters For all properties. NO SETTERS NEEDED
	public String getColor() {
		return color;
	}
	public short getBhp() {
		return bhp;
	}
	public short getCc() {
		return cc;
	}
	public String getTurbo() {
		return turbo;
	}
	public String getSelfDriving() {
		return selfDriving;
	}
	
	
	//Private Constructor
	private Car(CarBuilder builder) {
		this.color = builder.color;
		this.bhp = builder.bhp;
		this.cc = builder.cc;	
		this.turbo = builder.turbo;
		this.selfDriving = builder.selfDriving;
	}
	
	public void printDetails() {
		System.out.println("This is a "+color+" color car with a "+cc+"cc "+bhp+"bhp engine");
		if(!turbo.isEmpty())
			System.out.print("Has "+turbo);
		if (!selfDriving.isEmpty()) {
			System.out.print(" and "+selfDriving+" feature");
		}
	}
	
	//Builder class
	public static class CarBuilder{
		
		//Mandatory Props
		private String color;
		private short bhp;
		private short cc;
		
		
		//Optional Props
		private String turbo = null;
		private String selfDriving = null;
		
		
		public CarBuilder setTurbo(String turbo) {
			this.turbo = turbo;
			return this;
		}
		public CarBuilder setSelfDriving(String selfDriving) {
			this.selfDriving = selfDriving;
			return this;
		}
		
		
		//Builder class Constructor
		public CarBuilder(String color, short bhp, short cc) {
			this.color = color;
			this.bhp = bhp;
			this.cc = cc;
		}
		
		public Car build() {
			return new Car(this);
		}
		
	}

	

}
