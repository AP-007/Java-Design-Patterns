
public class CarFactory {
	
	/* 	The factory method should be static. 
		OR alternatively we can make the Factory a Singleton Class*/
	
	public static Car getCar(Abstract_CarFactory abstractCarFactory) {
		return abstractCarFactory.createCar();
	}
}
