package Methodcases;

public class ecxeption {                             // unchecked exception
	

	public static void main(String[] args) {
		
		int a=50;
		
		try {
			System.out.println(a/0); }
			
		catch(Exception e) {
			System.out.println("kach"); 
			}
		finally  {                                          // NOT NECESSARY ALWAYS
			
			System.out.println("final") ;                  // FINAL IS ALWAYS PRINTED IN RESULT
		}
		
		
		
		

	}

}
