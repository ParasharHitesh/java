package Practice;

public class MinInArray {

	public static void main(String[] args) {
		
	/*	int a[][]= {{2,3,4},{5,6,2},{1,3,9}};
		int min=a[0][0];
		
		for(int i=0;i<3;i++)   {
			
			for(int j=0;j<3;j++)  {
				
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		System.out.println(min);*/
		
		int a[][]= {{2,3,4},{5,6,2},{1,3,9}};
		
		int max=a[0][0];
		
		for(int i=0;i<3;i++)   {
			
			for(int j=0;j<3;j++)  {
				
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
