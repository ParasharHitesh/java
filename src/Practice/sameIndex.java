package Practice;

import java.util.ArrayList;

public class sameIndex {
	
	static int a[]= {1,2,3,4,5,6,7};
	static int b[]= {1,4,3,9,1,6,13};
	
	
	public static int[] commom(int a[],int b[]) {
	
		ArrayList list=new ArrayList();
		
		for(int i=0;i<a.length;i++) {
			

			if ( a[i]==b[i]) {
				
				//System.out.println(a[i]);
				//ArrayList list=new ArrayList();
				list.add(a[i]);
				//System.out.println(list);
				
				
				
			} 
			else {
				continue;
				
			}
				

			
		}
		Object[] c= list.toArray()	;
		for(Object k:c) {
		System.out.println(k);}
		return null;
	}
	
	public static void main(String[] args) {
		sameIndex get=new sameIndex();
		get.commom(a, b);

	}

}
