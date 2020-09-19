package Methodcases;

class A1 {
	
	void display() {
		
		System.out.println("This is class");
	}
}
	
	
interface XYZ {
		
		int a=10;
		void m1();
	}
	
	interface PQR {
		
		int b=20;
			void m2();
	}
	
	public class hybridinheritence extends A1 implements XYZ,PQR  {
		
		public void m1() {
			System.out.println(a);
		}
		
		public void m2() {
			
			System.out.println(b);
		}
		
		public static void main(String[] args) {
			
			hybridinheritence mu = new hybridinheritence();
			mu.m1();
			mu.m2();
			mu.display(); 
			}
	}
			
		
			


