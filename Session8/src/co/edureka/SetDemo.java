package co.edureka;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<String>();   //Polymorphic
		//HashSet<String> set = new HashSet<String>(); //Direct
		TreeSet<String> set = new TreeSet<String>(); // Sorted Arrangement
		// Uniqueness.. No Duplicate Data
		// Data is stored using Hashing Technique (Not Indexing) due to which output is unordered
		set.add("John");
		set.add("Jennie");
		set.add("Jim");
		set.add("Jack");
		set.add("Jennie");
		set.add("John");
		set.add("Joe");
		
		System.out.println(set); 
		
		if(set.contains("John")){
			
		}
		
		//set.remove("John")
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
	}

}
