package mysql;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class order {

	public static void main(String[] args) throws SQLException, IOException {
		String s="y";
		String p="y";
		/*Hashtable h1=new Hashtable();
		h1.put("vinothini","vino123");
		h1.put("shalini","shal123");
		h1.put("vaishali","vais123");
		h1.put("yashwini","yash123");*/
		System.out.println("<.<.<.<.<......Welcome to Sparkling food services.....>.>.>.>.>");
	    System.out.println("Please let us know are you an admin or customer");
		Scanner sc1=new Scanner(System.in);
		String ip=sc1.nextLine();
		if(ip.equals("admin")) {
			Hashtable h1=new Hashtable();
		    h1.put("vinothini","vino123");
		    h1.put("shalini","shal123");
		    h1.put("vaishali","vais123");
		    h1.put("yashwini","yash123");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter user name");
			String s1=br.readLine();
			System.out.println("enter password");
			String s2=br.readLine();
		    if(h1.containsKey(s1)) {
		    	if(h1.get(s1).equals(s2)) {
		    		//System.out.println("Both username and password is found");
		    		System.out.println("Press 1 to see vegetarian orders");
					System.out.println("Press 2 to see non_vegetarian orders");
					System.out.println("Press 3 to see fresh_juice orders");
					System.out.println("Press 4 to exit");
					Scanner sc=new Scanner(System.in);
		    		int i=sc.nextInt();
		    		read rr=new read();
					switch(i) {
					case 1:
						rr.vegetarian();
						break;
					case 2:
						rr.non_vegetarian();
						break;
					case 3:
						rr.fresh_juice();
						break;
					case 4:
						System.exit(0);
						break;
		    	}
		    	}
		    else {
		    	System.out.println("Both not found");
		    }
	     }
		}
		else if(ip.equals("customer")){ 
               while(s.equals("y")) {
					System.out.println("Services we provide are here please click any of the number to select what you need");
					System.out.println("Press 1 to choose vegetarian");
					System.out.println("Press 2 to choose non_vegetarian");
					System.out.println("Press 3 to choose fresh_juice");
					System.out.println("Press 4 to exit");
					Scanner sc=new Scanner(System.in);
					int i=sc.nextInt();
					delivery bb=new delivery();
					switch(i) {
					case 1:
						bb.vegetarian();
						break;
					case 2:
						bb.non_vegetarian();
						break;
					case 3:
						bb.fresh_juice();
						break;
					case 4:
						System.exit(0);
						break;
						
					}
					System.out.println("If you want to taste more press y otherwise press n");
					s=sc.next();
					if(s.equals("n")) {
						System.out.println("*********Thank You for ordering.Have a healthy day!***********");
						break;
					}
		}
		}
		

	}
	}
