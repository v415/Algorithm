
public class RunnableDemo1 implements Runnable {//用implements实现runnable接口
    private String threadName;
    private Thread t;
    public RunnableDemo1(String name) {
    	threadName=name;
    	System.out.println("Creating " +  threadName);
    }
	@Override
	public void run() {
		 System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // 让线程睡眠一会
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
		
	}
	public void start() {
		  System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }   
}
