package Practice;

public class Prime {

	public static void main(String[] args) {
		
		int a=9;
		boolean x=false;
		
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
			
			x=true;
			break;
			
			
			}}
			if(x)  {
			System.out.println("Not Prime");
			
		}
		else {
			System.out.println("Prime");
		}

	}

}
