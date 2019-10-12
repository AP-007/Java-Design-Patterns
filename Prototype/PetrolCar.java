
public class PetrolCar extends Vehicle {

	public PetrolCar() {
		type = "PETROL";
	}

	@Override
	void drive() {
		System.out.println(type + " car is running~~~~~~~~~~~~~~~~~~");
	}
}