
public class SingletonClass {
	private static volatile SingletonClass singleton = null;
	private int value=10;
	private SingletonClass() {
		
	}
	private SingletonClass(int value) {
		this.value=value;
	}
	
	public static SingletonClass getSingletonInstance() {
		synchronized (SingletonClass.class) {			
			if (singleton==null) 
				singleton=new SingletonClass();			
			return singleton;
		}
	}
	public static SingletonClass getSingletonInstance(int value) {
		synchronized (SingletonClass.class) {			
			if (singleton==null)
				singleton=new SingletonClass(value);		
			return singleton;
		}
	}
	
	public void setValue(int v) {
		value=v;
	}
	
	public int getValue() {
		return value;
	}
}
