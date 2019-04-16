
public class ThreadTest1 extends ThreadDemo1{

	public ThreadTest1(String name) {
		super(name);
	}

	public static void main(String[] args) {
		ThreadDemo1 t1=new ThreadDemo1("线程1");
		ThreadDemo1 t2=new ThreadDemo1("线程2");
		ThreadDemo1 t3=new ThreadDemo1("线程3");
		
		//启动该线程（Thread类的start()方法），并输出线程的id
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("t1线程的id为："+t1.getId());
		System.out.println("t2线程的id为："+t2.getId());
		System.out.println("t3线程的id为："+t3.getId());
	}

}
