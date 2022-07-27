package javaFsdProjects;

public class ParaConstructor {
	int id;
	String name;
	public ParaConstructor(int i,String n){   
	    id = i;  
	    name = n;  
    }  
   
    public void display()
    {
    	System.out.println(id+" "+name);
    }  
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor p1=new ParaConstructor(254,"Tarun");
		ParaConstructor p2=new ParaConstructor(256,"Arun");
		p1.display();
		p2.display();

	}

}
