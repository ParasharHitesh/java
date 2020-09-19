package Methodcases;

public class constructoroverloading {
	
	constructoroverloading(int a ,int b) {
		System.out.println(a+b);
		}
	constructoroverloading(int a ,double b) {
		System.out.println(a+b); }
	
	constructoroverloading(double a ,double b) {
		System.out.println(a+b);  }
	
	constructoroverloading(int a ,int b , int c) {
		System.out.println(a+b+c);  }
	
	

	public static void main(String[] args) {
		constructoroverloading ove = new constructoroverloading(10,20,30);

	
		
		

	}

}
