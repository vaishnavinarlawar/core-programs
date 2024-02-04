package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> languages = new LinkedList<>();

		languages.add("java");
		languages.add("python");
		languages.add("c");
		languages.add("c++");

		// access first element
		String l1 = languages.peek();
		System.out.println(l1);

		// access the first element and remove
		String l2 = languages.poll();
		System.out.println("remove element " + l2);

		System.out.println(languages);
		// add element at the end //FIFO

		languages.offer("Golang");
		System.out.println(languages);

		String l3 = languages.remove();
		System.out.println(l3);
		System.out.println(languages);

		languages.add("HTML");
		System.out.println(languages);

	}

}
