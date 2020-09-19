package Methodcases;

 class car {
	
	String colour= "white";                                          // instance
	
	void go()  {	
		System.out.println("fast");}                                    // method
	
	car()  {                                                            // constructor
		
		System.out.println("parent constructor");
		
	}
	
 }


class tyre extends car {
	
	String colour = "black";                                           // instance
	
      void Display() {                                                 // Method
		
		System.out.println(colour); 
		System.out.println(super.colour);}
      
      void go()  {	                                                   // method
  		System.out.println("slow");
  		super.go();}
      
      tyre()   {                                                          // constructor                                         
    	                                                                  
    	  super();                                        // no need _ just execution will change by this 
    	  System.out.println("child constructor");
      }
}
	
public class Super {

public static void main(String[] args) { 
	
	tyre ty = new tyre();     // first it will invoke constructor
	ty.Display();
	ty.go();
	
}

}
