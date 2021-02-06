package exp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.StringTokenizer;

public class UDPServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{	
			DatagramSocket ds=new DatagramSocket(8); 
			byte[] b = new byte[20];
			DatagramPacket in= new DatagramPacket(b,b.length);  
			System.out.println("Waiting for input........");
			ds.receive(in);
			
			String equ = new String(b).trim();
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
            
            String x = String.valueOf(result);
    		byte buff[] = x.getBytes();
			DatagramPacket out= new DatagramPacket (buff,  buff.length, in.getAddress(), in.getPort()); 
		
			ds.send(out);
			ds.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
/*
 * Before Client send the data: Waiting for input........
 * 
 * Takes the input computes the result and sends back the result to the Client
 * 
 */