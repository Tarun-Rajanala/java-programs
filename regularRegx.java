package javaFsdProjects;
import java.util.regex.*;
public class regularRegx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="[A-z]";
		String check="Welcome to java";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find())
		System.out.println(check.substring(c.start(),c.end()));

	}

}
