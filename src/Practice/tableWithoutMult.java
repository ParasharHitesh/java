package Practice;

public class tableWithoutMult {
    
	
	
	 
	public static void main(String[] args) {
		/* int x=5;
		 
		 while(x<51)  {
			 System.out.println(x);
			 x+=5;
		 }*/
		 
		tableWithoutMult.multiply(5,10);
		
		
		 
       

	}

	public static int multiply(int i, int j) {
		
		int sum=0;
		for(int k=1;k<=j;k++) {
			sum=sum+i;
			System.out.println(sum) ;
			
		}
		
		return sum;
	}


}