package Practice;

public class Reverse {

	public static void main(String[] args) {
		
		int a=825;
		int rev=0;
		while(a!=0) {
			
			int num=a%10;
			
			rev=num+rev*10;// 1 , 12 ,121
			
			a=a/10;
		}
		
			System.out.print(rev);
		}
	}


