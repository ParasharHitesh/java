package Practice;

import java.util.ArrayList;

public class duplicates {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,2,3,4,5,8,5,4};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)   {
			int k=0;
			if(!al.contains (a[i])) {
				al.add(a[i]);
				k++;                   // no bracket
				
				for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])	{
					k++;
				}
			}
				System.out.println(a[i]);
				//System.out.print("\t");
				System.out.println("" +k);
				if(k==1) {
					System.out.println("  "+a[i]+"is unique");
				}
		}
		
	}
		System.out.println(al);
}}
