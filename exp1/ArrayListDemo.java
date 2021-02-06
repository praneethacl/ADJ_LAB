package exp1;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Student> stlist = new ArrayList<Student>();
		Student st = new Student();
		st.setName("Rama");
		st.setRegdno("18b01a1201");
		st.setBranch("IT");
		stlist.add(st);
		
		Student st1 = new Student();
		st1.setName("Pra");
		st1.setRegdno("18b01a1212");
		st1.setBranch("IT");
		stlist.add(st1);
		
		System.out.println(stlist.size());
		
		for(int i = 0; i < stlist.size(); i++ ) {
			Student st2 = stlist.get(i);
			System.out.println(st2.getRegdno());
		}
	}

}
/*
OUTPUT
2
18b01a1201
18b01a1212

*/