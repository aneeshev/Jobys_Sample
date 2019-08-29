package com.java.collections.custom.map;

import java.util.HashMap;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String []args) {
		
		System.out.println("MyMap");
		
		SampleCustomMap<String, String> myMap = new SampleCustomMap<>();
        myMap.put("USA", "Washington DC");
        myMap.put("Nepal", "Kathmandu");
        myMap.put("India", "New Delhi");
        myMap.put("Australia", "Sydney");

        System.out.println(myMap.toString());
        
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("USA", "Washington DC");
        m.put("Nepal", "Kathmandu");
        m.put("India", "New Delhi");
        m.put("Australia", "Sydney");
        
        System.out.println(m.toString());
        
        System.out.println("\n\n HashMapCustom");
        
        HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
        hashMapCustom.put(21, 12);
        hashMapCustom.put(25, 121);
        hashMapCustom.put(30, 151);
        hashMapCustom.put(33, 15);
        hashMapCustom.put(35, 89);

        System.out.println("value corresponding to key 21="
                     + hashMapCustom.get(21));
        System.out.println("value corresponding to key 51="
                     + hashMapCustom.get(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();

        System.out.println("\n\nvalue corresponding to key 21 removed: "
                     + hashMapCustom.remove(21));
        System.out.println("value corresponding to key 51 removed: "
                     + hashMapCustom.remove(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();
        
        
	}
}
