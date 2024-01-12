package com.collections;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
List<String>StringList = new ArrayList<>();
		
		StringList.add("Vaishnavi");
		StringList.add("Ram");
		StringList.add("Swarali");
		StringList.add("Rucha");
		StringList.add("Snehal");
		
		Iterator<String>itr= StringList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
