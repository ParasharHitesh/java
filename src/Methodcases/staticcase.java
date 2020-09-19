package Methodcases;

public class staticcase {

	
	 
		static int a=10;             // STATIC VARIABLE
		int b=20;
		
		static void print(int a)  {                       // STATIC METHOD
			System.out.println(a);} //??????
		
		void prin()  {
			System.out.println(b);}
		
		public static void main(String[] args) {        //STATIC METHOD
			
			
	//	staticcase.print(11);
		
		
		// System.out.println(staticcase.a=11);                 // STATIC METHOD ACCESS STATIC VARIABLE DIRECT
	
		staticcase st = new staticcase();   
		 //     st.a=16; 
		 //     System.out.println(a);
		 System.out.println(st
				 .b=11);                                             // NEED OBJECT TO ACCESS NON STASTIC VARIABLE
		//System.out.println(st.b);
		//st.prin();                       // both same
		//st.print();
		
		
		}
		
			
		

	}


