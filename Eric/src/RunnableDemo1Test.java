
public class RunnableDemo1Test {

	public static void main(String[] args) {
		RunnableDemo1 r1 = new RunnableDemo1("thread-1");
		r1.start();
		RunnableDemo1 r2 = new RunnableDemo1("thread-2");
		r2.start();
	}

}
