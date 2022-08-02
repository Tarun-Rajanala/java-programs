package javaFsdProjects;
import java.util.*;

public class QueueDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new LinkedList<>();
		q.add("abc");
		q.add("def");
		q.add("ghi");
		q.add("ijk");
		q.add("lmn");
		System.out.println("Queue is: "+q);
		System.out.println("Head of Queue: "+q.peek());
		q.remove();
		System.out.println("After removing Head of Queue: "+q);
		System.out.println("Size of Queue: "+q.size());

	}

}
