	package Methodcases;

class Bank {
	
	void rateofintrest()  {
		
		System.out.println(0);
	}
}
	class SBI extends Bank {
		
		void rateofintrest()  {
			
			System.out.println(8);}
	}
		class ICICI extends Bank{
			
			void rateofintrest()  {
				
				System.out.println(9);}
		}
			class AXIS extends Bank {
				
				void rateofintrest()  {
					
					System.out.println(10);}
		
	}

public class overriding {

	public static void main(String[] args) {
		
		Bank sbi = new SBI();
		
		sbi.rateofintrest();
		
		
		
		
		

	}

}
