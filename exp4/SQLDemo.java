package exp4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			// Create query
			System.out.println("Creating a table");
			String query="CREATE TABLE employee.emp ("
					+ "empno INT NOT NULL,"
					+ "name VARCHAR(45) NOT NULL,"
					+ "sal INT NOT NULL,"
					+ "dept VARCHAR(45) NOT NULL)";
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Table Created\n");
			// output: Table Created
			
			System.out.println("Inserting Values");
			String query1 = "INSERT INTO emp " + "VALUES (101, 'Praneetha', 50000, 'CSE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO emp " + "VALUES (102, 'Sahithi', 59000, 'IT')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO emp " + "VALUES (101, 'Deepika', 10000, 'EEE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO emp " + "VALUES (101, 'Harshitha', 42000, 'MECH')";
			stmt.executeUpdate(query1);
			
			System.out.println("Displaying Values\n");
			ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
	         System.out.println("empno\tname\tsalary\tdept");
	         
	         while (rs.next()) {
	            int empno = rs.getInt("empno");
	            String name = rs.getString("name");
	            String sal = rs.getString("sal");
	            String dept = rs.getString("dept");
	            System.out.println(empno + "\t" + name + "\t" + sal + "\t" + dept);
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
Creating a table
Table Created

Inserting Values
Displaying Values

empno	name	salary	dept
101	Praneetha	50000	CSE
102	Sahithi	59000	IT
101	Deepika	10000	EEE
101	Harshitha	42000	MECH

*/