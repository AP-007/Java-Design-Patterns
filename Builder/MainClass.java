public class MainClass {

	public static void main(String[] args) {
		//Creating Builder Object
		Car.CarBuilder builder = new Car.CarBuilder("Red", (short)400, (short)3000);
		
		//Setting Optional Properties to builder object.
		builder.setTurbo("Twin Turbo").setSelfDriving("Assistive Self-Driving");
		
		//Invoking the build method
		Car car  = builder.build();
		
		car.printDetails();
	}

}
