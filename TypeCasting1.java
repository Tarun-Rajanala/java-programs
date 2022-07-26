package javaFsdProjects;

public class TypeCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Explicit TypeCasting
		System.out.println("This is Explicit TypeCasting");
		double x=48.967;
		float y=(float) x;
		long z=(long) y;
		int a=(int) z;
		char b=(char) a;
		System.out.println("double value of x:"+x);
		System.out.println("float value of y :"+y);
		System.out.println("long value of z:"+z);
		System.out.println("int value of a:"+a);
		System.out.println("char value of b:"+b);
		
		
		//Implicit TypeCasting
		System.out.println("This is Implicit TypeCasting");
		char p='A';
		int q=p;
		long r=q;
		float s=r;
		double t=s;
		System.out.println("char value of P:"+p);
		System.out.println("int value of Q:"+q);
		System.out.println("long value of R:"+r);
		System.out.println("float value of S:"+s);
		System.out.println("double value of T:"+t);
		
		
		
		

	}

}
