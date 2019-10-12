
public abstract class Vehicle implements Cloneable {
	String id;
	String type;
	Byte wheelCount;
	abstract void drive();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Byte getWheelCount() {
		return wheelCount;
	}
	public void setWheelCount(Byte wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
