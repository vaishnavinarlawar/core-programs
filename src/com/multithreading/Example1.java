package com.multithreading;


public class Example1 {

	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		Ex2 t1 = new Ex2();
		Ex2 t2 = new Ex2();
		// Ex2 t3=new Ex2();

		t1.start();
		// t2.setPriority(10);
		// t2.start();
		// for(int i=0; i<4; i++) {
		// t1.yield();

		// System.out.println(Thread.currentThread().getName() + "in control");

		// }
		// try {
		t1.interrupt();
		// }
		// catch(Exception e) {

		// }
		/*
		 * try { t1.join(); Thread.sleep(1000); } catch(Exception e) {
		 * 
		 * } t2.start(); t3.start();
		 */
	}
}

class Ex2 extends Thread {
	public void run() {
		// System.out.println("Hello");
		for (int i = 0; i < 4; i++) {
			System.out.println(Thread.currentThread().getName() + "in control");
		}

	}

}
