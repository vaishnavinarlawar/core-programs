package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StrimAllInOne {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 2, 6, 5, 7, 7, 3 };
		Map<Integer, Integer> hm = new HashMap<>();
		for (int b : a) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b) + 1);
			}

			else {
				hm.put(b, 1);

			}

		}
		for (Entry<Integer, Integer> h : hm.entrySet()) {
			if (h.getValue() == 1) {
				System.out.println(h.getKey() + "");
			}
		}

	}

}
