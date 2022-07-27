package javaFsdProjects;

public class stringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i="World";
		System.out.println(i.length());
		System.out.println(i.substring(2));
		System.out.println("String Comparison");
		String s1="Welcome";
		String s2="Welcone";
	    System.out.println(s1.compareTo(s2));
	    System.out.println("Checking Equality");
	    String p="Tarun";
	    String q="TaRUn";
	    System.out.println(p.equals(q));
	    System.out.println("checking string is Empty");
	    String s="";
	    System.out.println(s.isEmpty());
	    System.out.println("replacing string");
	    System.out.println(s2.replace('n','m'));
	    System.out.println(q.toLowerCase());
	    System.out.println(q.toUpperCase());
	    StringBuffer y=new StringBuffer("Welcome to Java");
	    y.append("! happy learning");
	    System.out.println(y);
	    System.out.println(y.insert(0,'E'));
	    System.out.println(y.reverse());
	    
	    
	    
	    
	    
	    
	    
	     
	     
	    		 

	}

}
