package com.java;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer>s1 = new HashSet<>();
		s1.add(1);
		s1.add(1);//Not Allow
		s1.add(2);
		System.out.println(s1);

	}

}
