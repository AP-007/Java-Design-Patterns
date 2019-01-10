
public class ElectricCar extends Car {
	
	String color;

	public ElectricCar(String color) {
		super();
		this.color = color;
	}
	
	@Override
	public void startRunning() {
		System.out.println(color+" color Electric Car Started Running....");
	}
	
	@Override
	public void stop() {
		System.out.println(color+" color Electric Car Stopped....");		
	}
}
