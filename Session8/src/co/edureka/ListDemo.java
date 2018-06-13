package co.edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String name;
	int salary;
	
	Employee(){
		
	}
	
	Employee(int i, String n, int s){
		eid = i;
		name = n;
		salary = s;
	}
	
	public String toString() {
		return eid+" belongs to "+name+". Salary is "+salary;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		// ArrayList implements List
		List<String> list1 = new ArrayList<String>(); // Polymorphic Statement
		ArrayList<String> list2 = new ArrayList<String>(); // Direct Object Construction
		ArrayList list3 = new ArrayList(); // Raw
		
		Employee e1 = new Employee(101,"John",30000);
		Employee e2 = new Employee(201,"Jennie",40000);
		Employee e3 = new Employee(301,"Fionna",40000);
		
		//System.out.println(e1); // e1.toString()
		//System.out.println(e2); // e2.toString()
		
		ArrayList<Employee> list4 = new ArrayList<Employee>(); // Direct Object Construction
		ArrayList<Integer> list5 = new ArrayList<Integer>(); // Direct Object Construction
		
		// Insert Operation
		list2.add(0,"John"); 	 //0
		list2.add("Jennie"); 	 //1
		list2.add("Jim"); 		 //2
		list2.add("Jack"); 		 //3
		list2.add("Jennie"); 	 //4
		list2.add("Joe"); 	 	 //5
		//list2.add(100);        // error 
		
		list3.add("John");
		list3.add(100); // list3.add(new Integer(100));
		list3.add(e1);
		list3.add(2.2);
		list3.add('A');
		list3.add(null);

		list4.add(e1); //0
		list4.add(e2); //1
		list4.add(e3); //2
		
		
		// Read Operation
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		
		// Read Single Record
		String name = list2.get(1);
		Object o = list3.get(3);
		Employee e = list4.get(0);
		
		System.out.println(name);
		System.out.println(o);
		System.out.println(e);
		
		// Size
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.indexOf("Jennie");
		idx = list2.lastIndexOf("Jennie");
		System.out.println("Jennie is at "+idx+" index");
		
		// Iterate in the List... 
		// 1. For Loop
		System.out.println("=======ForLoop======");
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		// 2. Enhanced For Loop
		System.out.println("=======EnhancedForLoop======");
		for(String s : list2){
			System.out.println(s);
		}
		System.out.println("===================");
		for(Object obj : list3){
			System.out.println(obj);
		}
		System.out.println("===================");
		for(Employee emp : list4){
			System.out.println(emp);
		}
		// 3. Iterator
		System.out.println("=======Iterator======");
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String n = itr.next();
			System.out.println(n);
			
			//if(n.equals("John"))
			//	itr.remove();       //remove the data from list
		}
		
		// 4. ListIterator
		System.out.println("=======ListIterator======");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String n = listItr.next();
			System.out.println(n);
			
			//if(n.equals("John"))
			//	listItr.remove();       //remove the data from list
		}
		System.out.println("--------");
		while(listItr.hasPrevious()){
			String n = listItr.previous();
			System.out.println(n);
		}
		
		// 5. Enumeration
		System.out.println("=======Enumeration======");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String n = enm.nextElement();
			System.out.println(n);
		}
		System.out.println("========================");	
		System.out.println(list2);
		// Remove Operation
		list2.remove(1);
		System.out.println(list2);
		
		// Update Operation
		list2.set(1, "Jim Watson");
		System.out.println(list2);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Fionna");
		names.add("George");
		names.add("Mike");
		
		list2.addAll(names); // Adding elements of names into list2
		System.out.println(names);
		System.out.println(list2);
		
		list2.clear();
		System.out.println(list2);
		
		// Thread-Safe
		Vector<String> vector = new Vector<String>();
		vector.add("Fionna"); //0
		vector.add("George"); //1
		vector.add("Mike");   //2
		
		System.out.println(vector);
		
	}

}
