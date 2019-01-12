
public class PetrolCarFactory implements Abstract_CarFactory{
	String color;
	
	public PetrolCarFactory(String color) {
		super();
		this.color = color;
	}

	@Override
	public Car createCar() {
		return new PetrolCar(color);
	}
}
