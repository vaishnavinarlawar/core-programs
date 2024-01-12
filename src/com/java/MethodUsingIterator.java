package com.java;

import java.util.HashSet;
import java.util.Iterator;

public class MethodUsingIterator {

	public static void main(String[] args) {
		HashSet<Integer>s1 = new HashSet<>();
		s1.add(123);
		s1.add(36);
		s1.add(24);
		System.out.println(s1);
		
		s1.remove(2);
		System.out.println(2);
		
		s1.isEmpty();
		System.out.println(s1);
		
		HashSet<Integer> s = new HashSet<>();
		s.add(1);
		s = (HashSet<Integer>) s1.clone();
		System.out.println(s);
		
		s1.size();
		System.out.println(1);
		
		s1.addAll(s);
		System.out.println(s1);
		
		Iterator<Integer> aa = s1.iterator();
	while(aa.hasNext()){
		int i = aa.next();
		System.out.println(i);
	}

	}

}
