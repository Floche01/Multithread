package q3;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.*;

public class MyClient {
	public static void main(String args[])
			throws MalformedURLException, RemoteException, NotBoundException, InterruptedException {
		// Complete this class.
		try {

			VoteInterface stub = (VoteInterface) Naming.lookup("rmi://localhost:1234/vote");
			Scanner sc = new Scanner(System.in);
			System.out.println("What is your vote?[yes|no] : ");
			String input = sc.nextLine();

			String result = stub.castVote(input.charAt(0));
			System.out.println(result);

		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
