package jdbc_connection_demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.*;
public class preparedstament {
	

	public static void main(String[] args)
	{
		
		try {
		//load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mg","root","root");
		//System.out.println("done......");
		
		//create prepared statement
		String query = "insert into stu() value(?,?,?)";
		
		PreparedStatement pst=con.prepareStatement(query);
		 Scanner sc = new Scanner(System.in);  
		 
		 while(true)
		 {
			   System.out.println("Student Id: ");

		    	int student_id = sc.nextInt();
		    	// this is putting in first column and first row

		    	pst.setInt(1, student_id); 
		    	
		    	
		    	System.out.println("Student Name: ");

		    	String student_name = sc.next();
		    	// this is putting in second column and first row

		    	pst.setString(2, student_name);
		    	
		    	
		    	System.out.println("Student city: ");

		    	String student_city = sc.next();
		    	
		    	// this is putting in Third column and first row

		    	pst.setString(3, student_city);
		    	
		    	// this is storing the how many row value u puted
		    	int rows= pst.executeUpdate();
		    	
		    	
		    	 System.out.println("To Add more records press 1 or  2 retrive data, 3 for exit");

				    int userInput = sc.nextInt();
				    
				    // this is for  loop activity
				    if(userInput==1)

				    {

				  	  

				    }
				    else if(userInput==2)
				    {
				    	
				    	pst=con.prepareStatement("select * from stu");
				    	ResultSet rs=pst.executeQuery();
				    	System.out.println("ID      "+"Name   "+"City  ");
				    	
				    	while(rs.next())
				    	{
				    		System.out.print(rs.getInt(1));
				    		System.out.print("\t"+rs.getString(2));
				    		System.out.println("\t"+rs.getString(3));
				    		
				    		
				    	}
				    	
				    	   break;
				    	
				    }

				    else

				    {

				  	  System.out.println("Data Is Successfully Inserted");

				  	  System.out.println("Rows Inserted -: "+rows);

				  	  System.exit(0);

				    }
		    	
		    	
		    	
		    	
		    	
			 
			 
		 }
		
		
		}catch(Exception e)
		{
			
			System.out.println(e);
		}
				
		

	}

}
