package javaFsdProjects;

public class ThrowsExample {
	void Division() throws ArithmeticException
	{
		int a=45,b=0,c;
		c=a/b;
		System.out.println("The result is: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample t=new ThrowsExample();
		try
		{
			t.Division();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error: "+ex.getMessage());
			
		}
		System.out.println("End of Program");

	}

}
