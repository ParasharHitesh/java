package Methodcases;

public class case3 {
	
	int x=3; // no use
	int y=2;  // no use
	
	void sum(int a,int b) {                          // method taking parameter but not returning value
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		case3 cal= new case3();
		cal.sum(2,3);
	}

}
