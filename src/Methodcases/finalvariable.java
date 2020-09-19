package Methodcases;

public class finalvariable {
	
	final int speed = 40;                      // cant be changed as final mentioned
	
	

	public static void main(String[] args) {
		
		finalvariable fv = new finalvariable();
		//fv.speed=100;                                    // compile time error
		System.out.println(fv.speed);
		 

	}

	
}
