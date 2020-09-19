package Methodcases;

public class case2 {

	int x=2;
	int y=3;
	
	int sum() {        // Method not taking parameters but returning value 
	return x+y;
	}
	
	
	public static void main(String[] args) {
		case2 cal= new case2();
		int res=cal.sum();                    // result res will hold return value
		System.out.println(res);
		System.out.println(cal.sum());         // both same

		

	}

}
