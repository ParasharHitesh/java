package Methodcases;

public class overloading {
	
	static void add(int a ,int b) {
		System.out.println(a+b);
		}
	 void add(int a ,double b) {
		System.out.println(a+b); }
	
	static void add(double a ,double b) {
		System.out.println(a+b);  }
	
	void add(int a ,int b , int c) {
		System.out.println(a+b+c);  }
	
	

	public static void main(String[] args) {
		overloading ove = new overloading();
		ove.add(10, 20);
		ove.add(10, 20.33);
		ove.add(10.33, 20.33);
		ove.add(10, 20,30);
		

	}

}
