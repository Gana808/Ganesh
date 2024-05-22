package jdbc_connection_demo;

import java.sql.*;


public class connection_demo {

	public static void main(String[] args)
	{
		
		try {
			
			 //register the Driver 
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   //etablish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mg","root","root");
		//check System.out.println("Connection is established....");
		
		 //make statement referencet to excute query
		
		 Statement s=con.createStatement();
		 
		 /* ******************************************************************* */
		 
		 // Creating table... by use methoe of ".executeUpdate()"
		 
		 // s.executeUpdate("create table stu(id int primary key, name varchar(50), city varchar(50))");
		   // s.execute("create table stu(id int primary key, name varchar(50), city varchar(50))");
		   // System.out.println("Created table successfully...");
		 
		 
		 /* ******************************************************************* */
		 //this is for delete table.
		 // s.executeUpdate("drop table stu");
		  //  s.execute("drop table stu");
		  // System.out.println("dropped table successfully...");
		 
		 /* ******************************************************************* */
		 
		 //inserting value in table
		 
		 //s.execute("insert into stu() value(1,'harish patil','pune')");
		 //s.execute("insert into stu() value(2,'vishal more','pune')");
		 //s.execute("insert into stu() value(3,'harish patil','pune')");
		// s.execute("insert into stu() value(4,'vishal more','pune')");
		// s.executeUpdate("insert into stu() value(5,'rahul more','Mumbai')");
		 
		// System.out.println("inserted value successfully...");
		
			
		 
		 /* ******************************************************************* */
		 
		  // read the table from database.
		 /*
		 
		    ResultSet r=s.executeQuery("select * from stu");
		    
		    
		    System.out.println("ID" +"\t"+"Name"+"\t\t"+"City");
		    while(r.next())
		    {
		       int id=r.getInt("id");
		       String name=r.getString("name");
		       String city=r.getString("city");
		       
		       System.out.println(id +"\t"+name+"\t"+city);
		    	
		    	
		    	
		    }
		    */
		 
		    /* ******************************************************************* */
		 
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
		
		
		
		
	}

}
