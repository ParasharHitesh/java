package Practice;

public class fibanocci {

	public static void main(String[] args) {
		int sum=0;
		int a=0;
		int b=1; 
		for(int i=0;i<9;i++)  {                                              //  1,2,3,5,8,13
		sum=a+b;
		System.out.println(sum);
		a=b;
		b=sum;
		}

	}

}
