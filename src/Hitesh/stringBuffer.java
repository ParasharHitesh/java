package Hitesh;

public class stringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(0, 4, "Bittu"); // start with 0 & will replace before 4
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		String s=new String("welcome");
		String s1=new String("welcome");
		
		s.concat(" java");
		System.out.println(s);
		
		
		
	

	}

}
