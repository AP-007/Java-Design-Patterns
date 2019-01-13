public class MainClass {

	public static void main(String[] args) {
		ClientA client = new ClientA(new ServerA()); //Constructor Injection
		client.invokeService();
		
		client = new ClientA(new ServerB());
		client.invokeService();
		
		client.setServer(new ServerC()); //Setter Injection
		client.invokeService();
		
	}

}
