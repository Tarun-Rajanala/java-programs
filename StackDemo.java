package javaFsdProjects;

public class StackDemo {
	private int arr[];
	private int top;
	private int cap;
	StackDemo(int size)
	{
	 arr=new int[size];
	 cap=size;
	 top=-1;
	}
	public void push(int x) {
		if (isFull()) 
		{
		 System.out.println("Stack is Full");
		 System.exit(1);
		}
		System.out.println("Inserting "+x);
		arr[++top]=x;
	}
	public int pop() {
		if(isEmpty()) 
		{
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return arr[top--];
	}
	public int getSize()
	{
		return top+1;
	}
	public Boolean isEmpty()
	{
		return top==-1;
	}
	public Boolean isFull()
	{
		return top==cap-1;
	}
	public void printStack() 
	{
	 for(int i=0;i<=top;i++)
	 {
		 System.out.print(arr[i]+", ");
	 }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo stack=new StackDemo(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.print("Stack:  ");
		stack.printStack();
		stack.pop();
		System.out.print("\nAfter popping: ");
		stack.printStack();

	}

}
