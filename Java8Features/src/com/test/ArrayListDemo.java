package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author aneesh.vijayan
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student(1, "Aneesh", 25);
		Student student1 = new Student(1, "Aneesh", 27);
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student1);
		System.out.println(students.toString());

		// Iterator<Student> it = students.iterator();
		// while(it.hasNext()){
		// System.out.println(it.next());
		// }

		// retainAll
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(student);
		students.retainAll(s);
		System.out.println(students.toString());

		// SortedSet - Interface.
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(student);
		System.out.println(hashSet.toString());

		TreeSet<Student> treeSet = new TreeSet<Student>();
		// treeSet.add(student);
		System.out.println(treeSet.toString());

		// Map
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(002, "vineesh");
		treeMap.put(001, "Aneesh");
		treeMap.put(003, "Saneesh");
		System.out.println(treeMap.toString());

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(003, "Saneesh");
		hashMap.put(001, "Aneesh");
		hashMap.put(002, "vineesh");
		System.out.println(hashMap.toString());

		for (Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
//		Concurrent Hash map.
//		checkedList
//		unmodifiableList - mutable.
//		synchronize - Thread safe
		
//		List<Integer> list =Collections.unmodifiableList(new ArrayList());
		List<Integer> list =Collections.checkedList(new ArrayList(), Integer.class);
		list.add(1);
		list.add(2);
		setData(list);
	
		// Creating empty priority queue 
        PriorityQueue<String> pQueue = new PriorityQueue<String>(); 
  
        // Adding items to the pQueue using add() 
        pQueue.add("C"); 
        pQueue.add("C++"); 
        pQueue.add("Java"); 
        pQueue.add("Python"); 
  
        // Printing the most priority element 
        System.out.println("Head value using peek function:"
                                           + pQueue.peek()); 
  
        // Printing all elements 
        System.out.println("The queue elements:"); 
        Iterator itr = pQueue.iterator(); 
        while (itr.hasNext()) 
            System.out.println(itr.next()); 
  
        // Removing the top priority element (or head) and 
        // printing the modified pQueue using poll() 
        pQueue.poll(); 
        System.out.println("After removing an element" + 
                           "with poll function:"); 
        Iterator<String> itr2 = pQueue.iterator(); 
        while (itr2.hasNext()) 
            System.out.println(itr2.next()); 
  
        // Removing Java using remove() 
        pQueue.remove("Java"); 
        System.out.println("after removing Java with" + 
                           " remove function:"); 
        Iterator<String> itr3 = pQueue.iterator(); 
        while (itr3.hasNext()) 
            System.out.println(itr3.next()); 
  
        // Check if an element is present using contains() 
        boolean b = pQueue.contains("C"); 
        System.out.println ( "Priority queue contains C " + 
                             "or not?: " + b); 
  
        // Getting objects from the queue using toArray() 
        // in an array and print the array  
        Object[] arr = pQueue.toArray(); 
        System.out.println ( "Value in array: "); 
        for (int i = 0; i<arr.length; i++) 
          System.out.println ( "Value: " + arr[i].toString()) ; 
	
	}
	
	public static void setData(List l){
		l.add("new");
	}

}
