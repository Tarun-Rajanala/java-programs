package javaFsdProjects;

public class ExtndThread extends Thread {
	public void run()
	{
		System.out.println("Thread is Running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtndThread Ext=new ExtndThread();
		Ext.start();

	}

}
