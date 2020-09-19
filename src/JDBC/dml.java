package JDBC;

public class dml {

	public static void main(String[] args) {                            //Steps to write JDBC program 
		
		Connection con=DriverManager.getconnection(" URL of database ");          // 1. CREATE CONNECTION
		
			Statement stmt =con.createstatement();                                // 2. CREATE QUERY
		
		String s="insert into table values(101,'Hitesh')";
		
		String s="update table set sname='Bittu' where sid=101";
		String s="delete tablename where sid=102)";
		
		stmt.executeQuery(s);                                                // 3. EXECUTE STATEMENT/Query
		
		con.close();                                                          // 4. close connection
		
		System.out.println("Program is completed");
		

	}

}
