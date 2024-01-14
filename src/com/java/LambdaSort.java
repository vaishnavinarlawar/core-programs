package com.java;

import java.util.Set;
import java.util.TreeSet;

public class LambdaSort {
	public static void main(String arg[]) {
		
		Set<Integer>set=new TreeSet<>();
		set.add(14);
		set.add(4);
		set.add(27);
		set.add(17);
		set.add(20);
		System.out.println("before sorting" + set);
		Set<Integer>set1=new TreeSet<>((a,b) -> b - a);
		set1.add(4);
		set1.add(14);
		set1.add(27);
		set1.add(17);
		set1.add(20);
System.out.println("after sorting" + set1);
		
	}

}
