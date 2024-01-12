package com.collections;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(1, "Vaishnavi");
		h1.put(2, "Rudrani");
		h1.put(3, "Swarali");
		h1.put(4, "Ram");

		/*
		 * for(Map.Entry <Integer,String> e: h1.entrySet()) {
		 * System.out.println(e.getKey()+" "+e.getValue());
		 */
		// System.out.println(h1);

		h1.get(2);
		System.out.println(h1);
		h1.remove(2);
		System.out.println(h1);
		System.out.println(h1.containsKey("rucha"));
		System.out.println(h1);
		System.out.println(h1.size());

		HashMap<Integer, String> h2 = new HashMap<>();

		h1.putAll(h2);
		System.out.println(h2);

		h2.put(1, "sunil");
		h2.put(2, "ravidra");
		System.out.println(h2);

		h2.putIfAbsent(1, "ram");
		h2.putIfAbsent(3, "vaishnavi");
		System.out.println(h2);

	}

}
