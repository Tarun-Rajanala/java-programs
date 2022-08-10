package javaFsdProjects;

public class StudentClassObject {
	String name;
	int id;
	int age;
	char sec;
	public StudentClassObject(String name,int id,int age,char sec)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.sec=sec;
	}
	public String getName()
	{
		return name;
	}
	public int getId() 
	{
		return id;
	}
	public int getAge() 
	{
		return age;
	}
	public char getSec() {
		return sec;
	}
	@Override
	public String toString()
	{
		return("The student name is "+this.getName()+".\n My id,age and section are "+this.getId()+", "+this.getAge()+", "+this.getSec()+".");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClassObject obj=new StudentClassObject("Lucifer",2456,24,'A');
		System.out.println(obj.toString());

	}

}
