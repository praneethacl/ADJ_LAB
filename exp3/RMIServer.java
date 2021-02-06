// RMI Server

import java.rmi.*;
import java.rmi.server.*;
import java.lang.Math;

public class RMIServer extends UnicastRemoteObject implements Power{
	
	public RMIServer() throws RemoteException{
		super();
	}

	public int power(int x,int n) throws RemoteException{
		int ans = (int)(Math.pow(x, n));
		return ans;
	}

	public static void main(String args[]) throws Exception{
		RMIServer server = new RMIServer();
		System.out.println("RMI Server is running");
		Naming.rebind("powerServer",server);
	}


}
/*
When the executed: RMIServer is running
*/