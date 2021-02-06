package exp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(2002);
		System.out.println("Server is ready for clients");
		Socket client = ss.accept();
		
		DataInputStream din = new DataInputStream(client.getInputStream());
		PrintStream pw = new PrintStream(client.getOutputStream());
		String equ = din.readLine();
		
		StringTokenizer st = new StringTokenizer(equ); 
        int oprnd1 = Integer.parseInt(st.nextToken()); 
        int oprnd2 = Integer.parseInt(st.nextToken()); 
        String operation = st.nextToken(); 
        
        int result;
        if (operation.equals("+")) 
        { 
            result = oprnd1 + oprnd2; 
        } 
        else if (operation.equals("-")) 
        { 
            result = oprnd1 - oprnd2; 
        } 
        else if (operation.equals("*")) 
        { 
            result = oprnd1 * oprnd2; 
        } 
        else
        { 
            result = oprnd1 / oprnd2; 
        } 
        pw.println(String.valueOf(result));
        //System.out.println(result);
		
		client.close();
		ss.close();
		
	}

}
/*
 * Before Client send the data: Server is ready for clients
 * 
 * Takes the input computes the result and sends back the result to the Client
 * 
 */
