public class MainClass {

	public static void main(String[] args) {
		Car electric = CarFactory.getCar(new ElectricCarFactory("Blue"));
		Car petrol = CarFactory.getCar(new PetrolCarFactory("Red"));
		
		electric.startRunning();
		electric.stop();
		
		petrol.startRunning();
		petrol.stop();
		
	}
}
