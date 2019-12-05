package q3;

import java.rmi.*;
import java.rmi.server.*;

public class VoteServerImpl extends UnicastRemoteObject implements VoteInterface {
	
	int yesVotes;
	int noVotes;

	public  VoteServerImpl() throws RemoteException {
		super();
		this.noVotes = 0;
		this.yesVotes = 0;
		
	}
  // Complete this class.

	@Override
	public String castVote(char vote) throws RemoteException {
		// TODO Auto-generated method stub
		if (vote == 'y') {
			yesVotes++;
		}else if (vote == 'n') {
			noVotes++;
		}
		return "Yes = " + yesVotes + "; No = " + noVotes;
	}
}
