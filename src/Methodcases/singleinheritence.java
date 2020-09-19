  package Methodcases;

class A {
	
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A {                                  // SINGLE INHERITENCE
	
	int b;
	void print() {
		System.out.println(b);
		
	}
	
}
class C extends B {                                    // MULTILEVEL INHERITENCE
	                                 // IN HIERARCHY Parent class is inherited by 2 child classes separately
	                                 //      with different objects. For ex : AB and AC.
	
	int c;
	void show()   {
		System.out.println(c);
		
	}
}

public class singleinheritence {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.a=10;
		obj.display();
		
		B ob = new B();
		ob.a=100;
		ob.b=200;
		ob.display();
		ob.print();
		
		C ex = new C();
		ex.a=100;
		ex.b=200;
		ex.c=300;
		ex.display();
		ex.print();
		ex.show();
		
		}

}
