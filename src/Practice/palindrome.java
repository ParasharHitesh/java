
package Practice;

public class palindrome {
	
	static String s;
	static String t="";
	
	public static String palin(String s) {
		
		for(int i=s.length()-1;i>=0;i--)  {
			
			t=t+s.charAt(i);
			}
		
		System.out.println(t);
		System.out.println(s);
		
		if(s.equals(t)) {
			System.out.print("s is palindrome");
		}
		else {
			System.out.print("s is not a palindrome");
		}
		return s;
	}

	public static void main(String[] args) {        // Reversing string/palindrome without reversing method
		palindrome.palin("madam");
		
}  }
