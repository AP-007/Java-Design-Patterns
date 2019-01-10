public class MainClass {

	public static void main(String[] args) {
		Car electric = CarFactory.getCar("electricity", "Blue");
		Car petrol = CarFactory.getCar("petrol", "Red");
    
		electric.startRunning();
		electric.stop();
    
		petrol.startRunning();
		petrol.stop();
		
	}

}
