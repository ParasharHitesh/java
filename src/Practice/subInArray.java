package Practice;

public class subInArray {
	
	static int[] a= {1,6,9,12,13};
	
	public static int[] sub(int[] a)  {
		
		int j[]= new int[4];
		
		for(int i=0;i<a.length-1;i++)  {
		
			j[i]=a[i+1]-a[i];
			}
	
		for(int k:j) {
			System.out.println(k);
		}
		
		
		return j;
		
	}
	

	public static void main(String[] args) {
	
	
		subInArray.sub(a);

	}

}
