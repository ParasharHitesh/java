package Hitesh;

public class student {
	int sid;
	String nam;
	char grad;
	
	void getValues(int id,String na,char g) {	
		sid=id;
		nam=na;
		grad=g;
	}
		
		
		student(int id,String na,char g){      // constructor
			sid=id;
			nam=na;
			grad=g;
			
		}
	
	
	void display() {
     System.out.println(sid+" "+nam+" "+grad);
	}
}
	