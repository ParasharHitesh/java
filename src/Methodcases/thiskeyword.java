package Methodcases;

public class thiskeyword {
	
	int a ;                                       // instance variable
	int b;                                  
	
	void getValues(int a, int b)  {                     // method variable
		
		this.a=a;                   //taken same variable to reduce memory taken by different variable
		this.b=b; 
	}
			void printValues() {
			System.out.println(a);
			System.out.println(b);
		}
	
	    public static void main(String[] args) {
	    	
	    	thiskeyword th= new thiskeyword();
	    	th.getValues(10,20);
	    	th.printValues();
	 

	}

}

