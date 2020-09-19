package Hitesh;

public class employeemain {

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
		emp2.display();	                        // object cant be shared so we make different class
		                                       // only method and variables are shared

	}

}
