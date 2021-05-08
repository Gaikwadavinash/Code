package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveEmpData {
	public static void main(String[] args) {
		try {
			
			//Type 4 driver
			//oracle drive
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//get connection
Connection con=DriverManager.getConnection
("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
//create Statement object 
Statement stm=con.createStatement();
//Create ResultSet object and excute Select Query
ResultSet rs=stm.executeQuery("Select *from emp");
//retriving data line by line
while(rs.next()) {
	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"
			+rs.getInt(4)+"\t "+rs.getDate(5)+"\t "+rs.getFloat(6)+"\t"
			+rs.getFloat(7)+"\t"+rs.getInt(8));
}
}catch(SQLException se ) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}
	}

}
