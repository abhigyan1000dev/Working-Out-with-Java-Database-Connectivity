package com.jdbctutorial;
import java.sql.*;



/* 1. Import the Driver
 * 2. Load the Driver and Register  
 * 3. Establish Connection 
 * 4. Statement tayyar kro 
 * 5. Execute the Query
 * 6. Store the Query Result in ResultSet Object
 * 7. close the statement
 * 8. close the connection
 */

public class MainClass {
	
	
	public static void main(String args[]) throws Exception
	{
		
			
//			Query for Normal statement
//			String query="insert into faculty values(129,'hariomprasad',67,'hariomo@gmail.com')";
			
			int faculty_id=88;
			String Name="Shuvalika";
			int classType=134;
			String email="shiba@gmail.com";
//			Query for dynamic statement
			String query="insert into faculty values(?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root", "abhi@2000");
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1,faculty_id);
			ps.setString(2, Name);
			ps.setInt(3, classType);
			ps.setString(4, email);
			//			Statement st=conn.createStatement();
			int count=ps.executeUpdate();
			
			System.out.print(count);
			ps.close();
			conn.close();
	}
}
