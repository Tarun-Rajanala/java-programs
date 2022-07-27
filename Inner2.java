package javaFsdProjects;

public class Inner2 {
	private String msg="Hello";
	void display()
	{
		class InnerClass{
			void msg() {
				System.out.println(msg);
			}
		}
		InnerClass i= new InnerClass();
		i.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner2 s=new Inner2();
		s.display();

	}

}
