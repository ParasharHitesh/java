package Practice;

public class occurence {

	
	
	
	public static int occur(String word,char character )  {
		
		
		int count=0;  // keep it here 
		for(int i=0;i<word.length();i++) {
		
		if(word.charAt(i)==character)  {
			count++;
			
		}
				
				
			}
		System.out.println(count);
		return count;
	}
		
	
public static void main(String[] args) {

	occurence.occur("mummy",'m');


	}

}
