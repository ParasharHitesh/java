package Methodcases;

public class case4 {
	
	int sum(int a,int b) {                          // method taking parameter and also returning value
		return(a+b);
	}
	
	
	
	 String s="123";
	 int a=Integer.parseInt(s);
	

	public static void main(String[] args) {
		case4 cal= new case4();
		System.out.println(cal.sum(3,2));
		
		case4 c=new case4();
		
		System.out.println(c.a);
}
}