
public class CarFactory {
	
	/* 	The factory method should be static. 
		OR alternatively we can make the Factory a Singleton Class*/
	
	public static Car getCar(String fuelType, String color) {
		if(fuelType.equalsIgnoreCase("petrol"))
			return new PetrolCar(color);
		else if(fuelType.equalsIgnoreCase("electricity"))
			return new ElectricCar(color);
		else return null;
	}
}
