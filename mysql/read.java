package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class read {
	public Connection getconn() 
	{
		Connection con=null;
		try 
		{
			String url="jdbc:mysql://localhost:3306/ownproject";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	

	Scanner sc1=new Scanner(System.in);
	public void vegetarian() throws SQLException{
		System.out.println("***Please enter customer details***");
		Connection con=getconn();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from vegetarian");
		while(rs.next()){
		System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
		}
		con.close();
	}
	
	public void non_vegetarian() throws SQLException{
		System.out.println("***Please enter customer details***");
		Connection con=getconn();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from non_vegetarian");
		while(rs.next()){
		System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
		}
		con.close();

	}
	public void fresh_juice() throws SQLException{
		System.out.println("***Please enter customer details***");
		Connection con=getconn();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from fresh_juice");
		while(rs.next()){
		System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
		}
		con.close();

	}

}
