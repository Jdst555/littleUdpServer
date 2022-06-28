package udpserver;

import java.net.SocketException;

public class RunServer {

	public static void main(String[] args) {
		try {
			EchoServer es = new EchoServer();
			es.run();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
