package javaFsdProjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();
		name.add("Williams");
		name.add("Rohit");
		name.add("Jason");
		System.out.println(name);
		System.out.println("\n");
		System.out.println("Vectors");
		Vector<Integer> id=new Vector();
		id.addElement(1);
		id.addElement(2);
		id.addElement(3);
		System.out.println(id);
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> city=new LinkedList<String>();  
	      city.add("Delhi");  
	      city.add("Mumbai");
	      city.add("Chennai");
	      Iterator<String> itr=city.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       System.out.println(set);
	       
	  
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       System.out.println(set2);
	      	} 
	      }  


		
		
		

	}


