package primosserver;

import primosserver.Primos;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8088/Primos", new Primos());
		System.out.println("Servidor aguardando conexes.");
	}

}
