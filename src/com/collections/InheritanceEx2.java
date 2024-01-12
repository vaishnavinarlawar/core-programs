package com.collections;

class SolarSystem1 {
public void s() {
	System.out.println("This is SolarSystem1");
}
 }
 class Earth extends SolarSystem1{
	public void a() {
		System.out.println("This Is Earth");
	}
	 
 }
 class Mars extends SolarSystem1{
	 public void b() {
			System.out.println("This Is Mars");
		}
	 
 }
 class Moon extends Earth{
	 
	 public void d() {
			System.out.println("This Is Moon");
		}
 }
  
public class InheritanceEx2 {

	public static void main(String[] args) {
		
		Earth a = new Earth();
		Mars b = new Mars();
		Moon d = new Moon();
	
		a.a();
		b.b();
		d.d();
		
	}

}
