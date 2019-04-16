
public class ThreadDemo1Test {

	public static void main(String[] args) {
		//创建一个线程的第二种方法是创建一个新的类，该类继承 Thread 类，然后创建一个该类的实例。
		//继承类必须重写 run() 方法，该方法是新线程的入口点。它也必须调用 start() 方法才能执行。
		//该方法尽管被列为一种多线程实现方式，但是本质上也是实现了 Runnable 接口的一个实例。
		ThreadDemo1 t1 = new ThreadDemo1("thread-1");
		t1.start();
		ThreadDemo1 t2 = new ThreadDemo1("thread-2");
		t2.start();
	}

}
