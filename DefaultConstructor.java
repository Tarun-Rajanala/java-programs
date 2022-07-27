package javaFsdProjects;

class Student{
	int reg;
	String name;
	void display() {
		System.out.println(reg+" "+name);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student();
		s.display();
		s1.display();

	}

}
