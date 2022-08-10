package javaFsdProjects;

public class RunnableThread implements Runnable{
	public static int i=0;
	public RunnableThread() {
		
	}
	public void run() {
		while(RunnableThread.i<=10) {
			try {
				System.out.println("TryThread:"+(++RunnableThread.i));
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Exception Thread: "+ie.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread...");
        RunnableThread rt = new RunnableThread();
        Thread s = new Thread(rt);
        s.start();
        while(RunnableThread.i <= 10){
            try{
                System.out.println("Main Thread: "+(++RunnableThread.i));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}


	
