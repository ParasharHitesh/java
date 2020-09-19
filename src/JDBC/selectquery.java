package JDBC;

public class selectquery {
	
public static void main(String[] args) {
		
		Connection con=DriverManager.getconnection(" URL of database ");          //CREATE CONNECTION
		
			Statement stmt =con.createstatement();                                // CREATE QUERY
		
		String s="select employee_id, first_name, last_name from tablename";
		
		ResultSet rs=stmt.executeQuery(s);                                      // EXECUTE STATEMENT
		
		while(rs.next())          // checks record is present or not ,next is to fetch records from each row
		{
	  int eid=rs.getInt("EMPLOYEE_ID");	
	  String fname=rs.getString("FIRST_NAME");
	  String lname=rs.getString("LAST_NAME");
	  System.out.println(eid+"  "+fname+"  "+lname);
		}
		
		con.close();                                                          // close connection
		
		System.out.println("Program is completed");
		

	}

}


