package javaFsdProjects;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45,b=0,c;
		try {
			if(b==0)
				throw(new ArithmeticException("Can't divide by zero"));
			else
			{
				c=a/b;
				System.out.println("The result is:"+c );
			}
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("Error:"+Ex.getMessage());
		}
		System.out.println("End Program");

	}

}
