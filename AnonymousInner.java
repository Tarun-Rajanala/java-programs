package javaFsdProjects;
abstract class Anonymous{
       public abstract void display();
}
public class AnonymousInner {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous a=new Anonymous() {
			public void display() {
				System.out.println("Anonymous Inner");
			}
			
		};
		a.display();

	}
}


