package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delivery {
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
		String s1="insert into vegetarian(name,address,fname,odate) values(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(s1);
		System.out.println("Enter customer name : ");
		String name=sc1.nextLine();
		System.out.println("Enter cutomer address : ");
		String address=sc1.nextLine();
		System.out.println("Enter what you want to taste");
		String soc=sc1.nextLine();
		System.out.println("Enter order date");
		String od=sc1.nextLine();
		stmt.setString(1,name);
		stmt.setString(2, address);
		stmt.setString(3, soc);
		stmt.setString(4, od);
		int a=stmt.executeUpdate();
		System.out.println("*****Order Placed******");
	}
	
	public void non_vegetarian() throws SQLException{
		System.out.println("***Please enter customer details***");
		Connection con=getconn();
		String s1="insert into non_vegetarian(name,address,fname,odate) values(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(s1);
		System.out.println("Enter customer name : ");
		String name=sc1.nextLine();
		System.out.println("Enter customer address : ");
		String address=sc1.nextLine();
		System.out.println("Enter what you want to taste");
		String soc=sc1.nextLine();
		System.out.println("Enter order date");
		String od=sc1.nextLine();
		stmt.setString(1,name);
		stmt.setString(2, address);
		stmt.setString(3, soc);
		stmt.setString(4, od);
		int a=stmt.executeUpdate();
		System.out.println("*****Order Placed******");

	}
	public void fresh_juice() throws SQLException{
		System.out.println("***Please enter customer details***");
		Connection con=getconn();
		String s1="insert into fresh_juice(name,address,fname,odate) values(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(s1);
		System.out.println("Enter customer name : ");
		String name=sc1.nextLine();
		System.out.println("Enter customer address : ");
		String address=sc1.nextLine();
		System.out.println("Enter which juice you need");
		String soc=sc1.nextLine();
		System.out.println("Enter order date");
		String od=sc1.nextLine();
		stmt.setString(1,name);
		stmt.setString(2, address);
		stmt.setString(3, soc);
		stmt.setString(4, od);
		int a=stmt.executeUpdate();
		System.out.println("*****Order Placed******");

	}

}
