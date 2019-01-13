
public class ClientA implements ClientService {
	ServerService server ; 
	
	public ClientA(ServerService server) {
		this.server = server;
	}

	public void setServer(ServerService server) {
		this.server = server;
	}

	@Override
	public void invokeService() {
		server.serve();		
	}
}
