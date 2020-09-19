 package Methodcases;


	
	interface P {
		
		int a=10;
		void m1();
	}
	
	interface Q {
		
		int b=20;
			void m2();
	}
	
	public class multipleinheritence implements P,Q {
		
		public void m1() {
			System.out.println(a);
		}
		
		public void m2() {
			
			System.out.println(b);
		}
		
		public static void main(String[] args) {
			
			multipleinheritence mu = new multipleinheritence();
			mu.m1();
			mu.m2();
			
		

	}

}
