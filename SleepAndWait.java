package javaFsdProjects;

public class SleepAndWait {
	private static Object o=new Object();
	

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+"Thread Woken after 3 seconds");
	synchronized(o) {
		o.wait(3000);
		System.out.println(o+"object is in wait state and wake afer 3 seconds");
	}

	}

}
