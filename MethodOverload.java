package javaFsdProjects;

public class MethodOverload {
	public void calculate(int r) {
		System.out.println("Area of circle is:"+(3.14*r*r));

	}
	public void calculate(int x, float y) {
		System.out.println("Area of rectangle is:"+(x*y));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            MethodOverload s=new MethodOverload();
            s.calculate(4);
            s.calculate(5,6.7f);
            }

}
