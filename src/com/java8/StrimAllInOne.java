package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StrimAllInOne {

	public static void main(String[] args) {

//		int a[] = { 1, 2, 3, 4, 2, 6, 5, 7, 7, 3 };
//		Map<Integer, Integer> hm = new HashMap<>();
//		for (int b : a) {
//			if (hm.containsKey(b)) { //containskey ckecks the value and it returns in boolean
//				hm.put(b, hm.get(b) + 1);
//			}
//
//			else {
//				hm.put(b, 1);
//
//			}
//
//		}
//		for (Entry<Integer, Integer> h : hm.entrySet()) {
//			if (h.getValue() == 1) {
//				System.out.println(h.getKey() + "");
//			}
//		}
//		
		
int a[]= {1,2,3,5,2,4,7,8,8,1};
Map<Integer,Integer>hm=new HashMap<>();
for(int b:a) {
	if(hm.containsKey(b)) {
		hm.put(b, hm.get(b)+1);
	}else {
		hm.put(b, 1);
	}
}
for(Entry<Integer, Integer> h:hm.entrySet()) {
	if(h.getValue()==1) {
		System.out.println(h.getKey()+ "");
	}
}
		 
	}

}
