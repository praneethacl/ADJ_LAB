package exp1;

import java.util.*;  
class HashtableDemo{  
 public static void main(String args[]){  
	 Hashtable<Integer, String> ht1 = new Hashtable<>(); 
	 
     ht1.put(1212, "Praneetha"); 
     ht1.put(1213, "Sahithi"); 
     ht1.put(1214, "Deepika"); 

     System.out.println("The Hastable: " + ht1);
     
     System.out.println("\nUsing for-loop to access the values:");
     for (Map.Entry< Integer, String> e : ht1.entrySet()) 
         System.out.println(e.getKey() + " " + e.getValue()); 
 }  
} 
/*
OUTPUT
The Hastable: {1214=Deepika, 1213=Sahithi, 1212=Praneetha}

Using for-loop to access the values:
1214 Deepika
1213 Sahithi
1212 Praneetha


*/