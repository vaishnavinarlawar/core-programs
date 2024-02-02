package com.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList<Integer> l2 = new LinkedList<>();

		l2.add(123);
		l2.add(36899);
		l2.add(24);
		l2.addFirst(45);
		l2.addFirst(46);

		l2.remove(0);
		l2.removeFirst();
		l2.removeLast();
		l2.add(2);
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());

		Object arr[] = l2.toArray();
		System.out.println(Arrays.toString(arr));

	}

}
