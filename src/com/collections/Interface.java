package com.collections;

interface A{
	void a() ;
		
}
interface B {
	void b() ;
		
}

class D implements A,B  {
public void a() {
	System.out.println("Method a");
	
}
public void b() {
	System.out.println("Method b");
	
}
}
public class Interface {

	public static void main(String[] args) {
		D obj = new D();
		obj.a();
		obj.b();

		
	}

}
