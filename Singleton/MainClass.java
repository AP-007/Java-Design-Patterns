
public class MainClass {
	public static void main(String[] args) {
		SingletonClass s = SingletonClass.getSingletonInstance();
		System.out.println(s.getValue());
		s.setValue(20);		
		SingletonClass s1 = SingletonClass.getSingletonInstance(); 
		System.out.println(s1.getValue());
		
	}

}
