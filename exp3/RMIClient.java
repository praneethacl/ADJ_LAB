//RMI Client

import java.rmi.*;
import java.util.*;

public class RMIClient {
	public static void main(String args[]) throws Exception{

		int x,n,result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base number(x): ");
		x=sc.nextInt();
		System.out.println();
		System.out.print("Enter power number(n): ");
		n=sc.nextInt();
		System.out.println();
		Power p=(Power)Naming.lookup("rmi://localhost:1099/powerServer");

		result = p.power(x,n);

		System.out.println("Result:"+result);


	}
}
/*
OUTPUT:
when executed:
	Enter base number(x): 3

	Enter power number(n): 2

	Result:9

*/