package javaFsdProjects;

class MyException extends Exception{
	String s1;
	MyException(String s2){
		s1=s2;
	}
	public String toString() {
		return("MyException Occured:"+s1);
	}
}
public class ExceptionHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Starting of try block");
			throw new MyException("This is my error message");
		}
		catch(MyException exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
		}

	}
	
}
