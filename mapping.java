package javaFsdProjects;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Rohit");    
	      hm.put(2,"Virat");    
	      hm.put(3,"Hardik");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry i:hm.entrySet()){    
	       System.out.println(i.getKey()+" "+i.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Alex");  
	      ht.put(5,"Hales");  
	      ht.put(6,"Williams");  
	      ht.put(7,"Buttler");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry j:ht.entrySet()){    
	       System.out.println(j.getKey()+" "+j.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Broad");    
	      map.put(9,"Steyn");    
	      map.put(10,"Cook");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry k:map.entrySet()){    
	       System.out.println(k.getKey()+" "+k.getValue());    
	      }    


	}

}
