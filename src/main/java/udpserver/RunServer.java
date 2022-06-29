package udpserver;

import java.net.SocketException;

import client.EchoClient;

public class RunServer {

	
	static EchoServer es;
	static EchoClient ec = new EchoClient();
	public static void main(String[] args) {
		try {
			es = new EchoServer();
			es.start();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String reply = ec.sendEcho("end");
		System.out.println(reply);
		

	}

}
