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
		
			System.out.println(rev);
		}
	}
 //      num 5      rev 5
//       82 a     num 2  2+5x10     rev 52
//       8 a     num 8  8+52x10    rev 528  
//       now a/10 is 0 , so while loop break.