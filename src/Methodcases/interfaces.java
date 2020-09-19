package Methodcases;

interface J {
	
	int a=20;                                      // variables in interface are static and final
	void m1();              // abstract methods i.e, no body
	//void m2();   // Need to add this method in class otherwise error
	}           // **its is mandatory for class to use all methods of interface it implements

 public class interfaces implements J {
	 
	
	 public void m1()  {
		 System.out.println(a);
	 }
 
      public static void main(String[] args) {
    	  
    	  interfaces inter = new interfaces();
    	  
    	// inter.a=11;    // Interface contain variable & methods  as final by default
    	//  inter.m1();
    	  
    	  J al = new interfaces();
    	  al.m1();
    	  
		
		

	}

}
