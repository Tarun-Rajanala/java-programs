package javaFsdProjects;
class PrintSync{
	public void display()
	{
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Counter ----"+i);
			}
		}catch(Exception e) {
			System.out.println("Thread interrupted");
		}
	}
	
}
class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	PrintSync PS;
	ThreadDemo(String name,PrintSync ps)
	{
		threadName=name;
		PS=ps;
	}
	public void run() {
		synchronized(PS) {
			PS.display();
		}
		System.out.println("Thread "+ threadName+" existing");
	}
	public void start() {
		System.out.println("Starting "+threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}
}

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSync PS=new PrintSync();
		ThreadDemo t1=new ThreadDemo("Thread - 1 ",PS);
		ThreadDemo t2=new ThreadDemo("Thread - 2 ",PS);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
		

	}

}
