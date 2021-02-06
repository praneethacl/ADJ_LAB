package exp1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Contacts> contacts = new HashMap();
		
		contacts.put("1212@gmail.com", new Contacts("1212@gmail.com", "Praneetha", "9000000000"));
		contacts.put("1213@gmail.com", new Contacts("1213@gmail.com", "Sahithi", "9000009000"));
		contacts.put("1214@gmail.com", new Contacts("1214@gmail.com", "Deepika", "9000033000"));
		
		System.out.println("The HashMap contains: " + contacts);
		System.out.println("\nThe size of the HashMap: " + contacts.size());
		
		System.out.println("\nChecking in '1213@gmail.com' is in the keys: " + contacts.containsKey("1213@gmail.com"));

		Set keys = contacts.keySet();
		
		Iterator keysit = keys.iterator();
		System.out.println("\nAccessing the data using for-loop:");
		while(keysit.hasNext()) {
			String key = keysit.next().toString();
			Contacts c = contacts.get(key);
			System.out.print("email: " + c.getEmail());
			System.out.print("\tname: " + c.getName());
			System.out.println("\tmobile: " + c.getMobile());
		}
	}

}
/*
OUTPUT

The HashMap contains: {1214@gmail.com=exp1.Contacts@2d363fb3, 1213@gmail.com=exp1.Contacts@7d6f77cc, 1212@gmail.com=exp1.Contacts@5aaa6d82}

The size of the HashMap: 3

Checking in '1213@gmail.com' is in the keys: true

Accessing the data using for-loop:
email: 1214@gmail.com	name: Deepika	mobile: 9000033000
email: 1213@gmail.com	name: Sahithi	mobile: 9000009000
email: 1212@gmail.com	name: Praneetha	mobile: 9000000000

*/