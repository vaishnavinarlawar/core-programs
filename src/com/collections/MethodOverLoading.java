package com.collections;

public class MethodOverLoading {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(float a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, float b) {
		System.out.println(a + b);
	}

	void sum(float a, float b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverLoading meth = new MethodOverLoading();

		meth.sum(1, 15);
		meth.sum(1f, 3);
		meth.sum(4, 5f);
		meth.sum(3f, 4f);
	}

}
