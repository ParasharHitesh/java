package Practice;

public class sumArray {
	
	static int a[]= {1,2,3,4,5}	;
	
	public static int addition(int[] a) {
		
	int sum=0;
	for(int i=0;i<a.length;i++)  {
		
		//	System.out.println(a[i]);
		 sum=sum+a[i];
		
	
	
	}
	System.out.println(sum);
	return sum;
		
	}

	public static void main(String[] args) {
	
		sumArray.addition(a);
	
		
		
		
		

	}

	

}
