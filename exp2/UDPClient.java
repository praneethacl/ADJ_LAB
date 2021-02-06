package exp2;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress ia=InetAddress.getLocalHost(); 
			DatagramSocket ds=new DatagramSocket (1025,ia);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the integers and operand with space(operand operand operator):");
			String num = sc.nextLine();
			
			byte[] b = num.getBytes();
			DatagramPacket dp = new DatagramPacket(b, b.length, ia, 8); 
			ds.send(dp);
			
			byte[] buff=new byte[2000];
			DatagramPacket in = new DatagramPacket(buff, buff.length); 
			ds.receive(in);
			System.out.println("recieved from server: "+ (new String(buff)));
			
			
			ds.close();
			sc.close();
		}
		catch(SocketException se){
			System.out.println(se);
		}
		catch(IOException ie)	{
			System.out.println(ie);
		}


	}
		

}

/*
OUTPUT
 
Enter the integers and operand with space(operand operand operator):
INPUT: 15 15 -

Result received from the server:
	received from server: 0
*/