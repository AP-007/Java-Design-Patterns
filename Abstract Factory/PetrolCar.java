
public class PetrolCar extends Car {
	
	String color;	
	
	public PetrolCar(String color) {
		super();
		this.color = color;
	}

	@Override
	public void startRunning() {
		System.out.println(color+" color Petrol Car started Running....");		
	}
	
	@Override
	public void stop() {
		System.out.println(color+" color Petrol Car Stopped.....");
	}
}
