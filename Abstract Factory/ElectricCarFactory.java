
public class ElectricCarFactory implements Abstract_CarFactory{
	private String color;
	
	public ElectricCarFactory(String color) {
		super();
		this.color = color;
	}

	@Override
	public Car createCar() {
		return new ElectricCar(color);
	}
}
