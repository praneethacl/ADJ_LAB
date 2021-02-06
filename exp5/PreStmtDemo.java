package exp5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PreStmtDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			
			String query="update emp set sal=? where empno=?";
			
			PreparedStatement upsmt=con.prepareStatement(query);
			
			upsmt.setString(1, "200000");
			upsmt.setString(2, "104");
			
			int rows=upsmt.executeUpdate();
			System.out.println(rows+" row(s) are updated.");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			System.out.println("empno\tename\t\tsal\t\tdept");
			
			while (rs.next()) {
	            int empno = rs.getInt("empno");
	            String name = rs.getString("name");
	            String sal = rs.getString("sal");
	            String dept = rs.getString("dept");
	            System.out.print(empno + "\t");
	            System.out.print(name + "\t\t");
	            System.out.print(sal + "\t");
	            System.out.println(dept);
	         }
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}

/*
OUTPUT:

Before:
	1 row(s) are updated.
	empno	ename		sal		dept
	101		Praneetha	50000	CSE
	102		Sahithi		100000	IT
	103		Deepika		10000	EEE
	104		Harshitha	50000	MECH

After:
	1 row(s) are updated.
	empno	ename		sal		dept
	101		Praneetha	50000	CSE
	102		Sahithi		100000	IT
	103		Deepika		10000	EEE
	104		Harshitha	200000	MECH



*/