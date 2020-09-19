package Methodcases;

public class constructor {

	int x;
	int y;
	
	constructor()  {    // default constructor 
		x=10;
		y=20;	
	}
		constructor(int a,int b) {               // parameterized constructor
			x=a;
			y=b;
			
			}
		
	
	void display()
	{
		System.out.println(x+y);	}
		


	public static void main(String[] args) {
		constructor def= new constructor();                     // invokes default constructor
		def.display();
		
		constructor def1= new constructor(100,200);            // invokes parameterized constructor
		def1.display();
		
		

		

	}

}
