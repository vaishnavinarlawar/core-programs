package com.collections;

public class GetOrSet {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		GetOrSet obj = new GetOrSet();
		obj.setA(19);
		int c = obj.getA();
		System.out.println(c);
		

	}

}
