package Practice;    //sort:print with loop
                   
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ROUGHsheet {
	
	public static int tab(int i,int j) {
		
		int sum=0;
		
		for(int k=0;k<j;k++) {
			
			sum=sum+i;
			System.out.println(sum);
		}
		
		
		return j;
	}
		
		
	
	public static void main(String[] args) {
		ROUGHsheet.tab(5, 10);
			
	}}