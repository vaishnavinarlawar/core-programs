package com.collections;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add(1);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);

		Iterator<Integer> itr = linkedList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		List<String> a = new LinkedList<>();

		a.add("abc");

		a.add("pqr");

		a.add("xyz");

		a.add("str");

		Iterator<String> itr2 = a.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}

	}

}
