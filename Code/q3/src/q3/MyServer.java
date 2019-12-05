package q3;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class MyServer {
	public static void main(String args[]) {
		// Complete this class.
		try {			
			VoteServerImpl stub = new VoteServerImpl();
			LocateRegistry.createRegistry(1234);
			Naming.rebind("rmi://localhost:1234/vote", stub);
			System.out.println("Voting Server ready.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
