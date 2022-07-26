package javaFsdProjects;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Emailid=new ArrayList<String>();
        Emailid.add("tarunsai@gmail.com");
        Emailid.add("vamshi@gmail.com");
        Emailid.add("pavan@gmail.com");
        Emailid.add("sravan@gmail.com");
        Emailid.add("bargav@gmail.com");
        Emailid.add("suresh@gmail.com");
        Emailid.add("ramesh@gmail.com");
        Emailid.add("kesav@gmail.com");
        Emailid.add("rakesh@gmail.com");
         String EmailValidation=null;
         System.out.println("Enter Emailid:");
         Scanner input=new Scanner(System.in);
         EmailValidation=input.nextLine();
         if(EmailValidation==null) {
        	 System.out.println("Please Enter an Emailid");
        	 return;
         }
         if (Emailid.contains(EmailValidation)) {
        	 System.out.println("emailid "+EmailValidation+" found");
        	 }
         else {
        	 System.out.println("emailid "+EmailValidation+" not found");
        	 
         }
        
        
	}

}
