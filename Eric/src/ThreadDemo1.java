
public class ThreadDemo1 extends Thread {
    private Thread t;
	private String threadName;

	 ThreadDemo1(String name) {
		threadName = name;
		System.out.println("creating"+threadName);
	}
    
	public void run() {//必须重写run方法
		System.out.println("Running" + threadName);
		for(int i=4;i>0;i--) {
			System.out.println("Thread:"+threadName+","+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Thread:"+threadName+"interrupted");
			}
			System.out.println("Thread:"+threadName+"exiting");
		}		
	}
	public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}

