package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {
	public static void main(String arg[]) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(65);
		list.add(43);
		Collections.sort(list, (a, b) -> a - b);
		System.out.println(list);
	}

}
