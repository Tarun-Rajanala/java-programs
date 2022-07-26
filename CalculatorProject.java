package javaFsdProjects;
import java.util.Scanner;
public class CalculatorProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P,Q;
		double result;
		char operator;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter FirstNumber: ");
		P=input.nextDouble();
		System.out.println("Enter SecondNumber: ");
		Q=input.nextDouble();
		System.out.println("Choose Operator(add(+),subract(-),multiply(*),divide(/)): ");
		operator=input.next().charAt(0);
	    switch(operator)
		{
	    case '+':result=P+Q;
	    	break;
	    case '-':result=P-Q;
	    	break;
	    case '*':result=P*Q;
	    	break;
	    case '/':result=P/Q;
	    	break;
	    default:System.out.println("Error!select an operator from the list");
	    return;
	    	}
	    System.out.println(P+" " +operator+ " " +Q+ " = " +result);
		}
}
