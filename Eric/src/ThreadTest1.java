
public class ThreadTest1 extends ThreadDemo1{

	public ThreadTest1(String name) {
		super(name);
	}

	public static void main(String[] args) {
		ThreadDemo1 t1=new ThreadDemo1("�߳�1");
		ThreadDemo1 t2=new ThreadDemo1("�߳�2");
		ThreadDemo1 t3=new ThreadDemo1("�߳�3");
		
		//�������̣߳�Thread���start()��������������̵߳�id
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("t1�̵߳�idΪ��"+t1.getId());
		System.out.println("t2�̵߳�idΪ��"+t2.getId());
		System.out.println("t3�̵߳�idΪ��"+t3.getId());
	}

}
