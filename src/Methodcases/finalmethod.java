
package Methodcases;


	class X  {                                      // ##### if final is written before class
		
	final void display()  {                             // @@@@ final mentioned
		
		System.out.println("Hitesh");
	}
	}
	
	class Z extends X {       // ##### then here it will show error
		
		void display()   {                      //@@@@ thats why shows error and cannot override
			System.out.println("Hitesh");}
		}
	
	
	public class finalmethod {

	public static void main(String[] args) {
		
		Z h = new Z();
		h.display();
		
		

	}

}
