
public class ElectricCar extends Vehicle {
	
	public ElectricCar() {
		type = "ELECTRIC";
	}
	
	@Override
	void drive() {
		System.out.println( type+" car is running~~~~~~~~~~~~~~~~~~");
	}
}
