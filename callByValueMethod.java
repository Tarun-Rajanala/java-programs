package javaFsdProjects;

public class callByValueMethod {
	int val=150;
	int operation(int val) {
		val=val*10/100;
		return (val);
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		callByValueMethod s=new callByValueMethod();
		System.out.println("First value:"+s.val);
		int i=s.operation(100);
		System.out.println("After calling value:"+i);

	}

}
