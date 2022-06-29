package udpserver;

import java.net.SocketException;



public class RunServer {

	
	static EchoServer es;
	
	public static void main(String[] args) {
		try {
			es = new EchoServer();
			es.start();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
