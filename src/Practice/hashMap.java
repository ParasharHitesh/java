package Practice;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		//HashMap hm = new HashMap();
		
				HashMap <Integer,String> hm = new HashMap <Integer,String> ();
				
				hm.put(101, "Hitesh");
				hm.put(102, "Bittu");
				hm.put(103, "Ritesh");
				hm.put(104, "Anurag");
				
				System.out.println(hm);
					
				hm.remove(103);
				System.out.println(hm);
				
				hm.put(103, "Gaazi");
				
				for(Map.Entry m:hm.entrySet())  
				
				{
					
					System.out.println(m.getKey()+"  "+m.getValue()); 
				}
				

	}

}
