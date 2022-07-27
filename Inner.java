package javaFsdProjects;

public class Inner {
	private String msg="Hi";
	class InnerClass{
		void display() {
			System.out.println(msg+"! This is Tarun");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i=new Inner();
		Inner.InnerClass in=i.new InnerClass();
		in.display();

	}

}
