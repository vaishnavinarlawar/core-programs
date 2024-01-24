package com.multithreading;

public class ExceptionEx {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		method2();
	}

	private static void method2() {

		try {
			// String str = null;//null
			// str.toString();//error throw//NullPointerException

			// int x = 50;
			// int y = 50/0;

			// String s = "vaishnavi";//"23"
			// int n = Integer.parseInt(s);

			int[] arr = new int[2];
			arr[3] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception cought in ArrayIndexOutOfBoundsException block");
		} catch (NullPointerException e) {
			System.out.println("Exception aught in NullPointerexception block");
		} catch (Exception e) {
			// System.out.println(e);

			// System.out.println("Exception caught");

			System.out.println("Exception caught in Exception block");
		}

	}

}
