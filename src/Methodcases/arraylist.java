package Methodcases;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {         
		
		ArrayList <String> list = new ArrayList <String>();
		
		//ArrayList <Integer> list = new ArrayList <Integer> ();
		
		//ArrayList list = new ArrayList();           //--> takes all  // int a[] = new int[5];  takes int only
		                                                       
		list.add("Manoj");                                       // Object a[] = new Object[5]; takes all values
		list.add("Naveen");
		list.add("Atul");
		list.add("101");
		
		System.out.println(list.size());
		
		list.remove(2);
		System.out.println(list.size());
		
		list.add(0,"Ritesh");
		System.out.println(list.size());
		
		System.out.println(list);
		
		for(Object s:list) {
		System.out.println(s);
		}

	}

}
