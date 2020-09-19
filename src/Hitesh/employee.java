package Hitesh;

public class employee {

	
		int eid;
		String name;
		double sal;
		int dept;
		String job;
		void display() {
			System.out.println(eid);
			System.out.println(name);
			System.out.println(sal);
			System.out.println(dept);
			System.out.println(job);
		}
			
		public static void main(String[] args) {
			employee emp1= new employee();	
			emp1.eid=101;
			emp1.name="Hitesh";
			emp1.sal=50000;
			emp1.dept=11;
			emp1.job="Tester";
			emp1.display();
			
			employee emp2= new employee();
			emp2.eid=102;
			emp2.name="Bittu";
			emp2.sal=50000;
			emp2.dept=21;
			emp2.job="Tester";
			emp2.display();	
			
		}
		

	

}
	