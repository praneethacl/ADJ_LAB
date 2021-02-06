// Interface file
import java.rmi.*;

public interface Power extends Remote {

	// declaration of remote methods

	public int power(int x, int n) throws RemoteException;
}

/*
It is used in RMIClient
*/