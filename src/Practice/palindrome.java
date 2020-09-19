package Practice;

public class palindrome {

	public static void main(String[] args) {        // Reversing string/palindrome without reversing method
		
		String s="madam";
		String t="";
		
		for(int i=s.length()-1;i>=0;i--)  {
			
			t=t+ s.charAt(i);
			
			System.out.print(s.charAt(i));
			
		}
		System.out.println();
		System.out.println(t);
		System.out.println(s==t);
       
	}

}
