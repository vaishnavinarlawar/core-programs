package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		Deque<String> d1 = new ArrayDeque<>();
		d1.push("Message1");
		d1.push("Message2");

		System.out.println(d1);

		System.out.println(d1.pop());

		System.out.println(d1.peek());

		System.out.println(d1.poll());

		System.out.println(d1.pollLast());

		System.out.println(d1.peekFirst());

	}

}
