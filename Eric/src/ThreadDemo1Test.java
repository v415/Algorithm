
public class ThreadDemo1Test {

	public static void main(String[] args) {
		//����һ���̵߳ĵڶ��ַ����Ǵ���һ���µ��࣬����̳� Thread �࣬Ȼ�󴴽�һ�������ʵ����
		//�̳��������д run() �������÷��������̵߳���ڵ㡣��Ҳ������� start() ��������ִ�С�
		//�÷������ܱ���Ϊһ�ֶ��߳�ʵ�ַ�ʽ�����Ǳ�����Ҳ��ʵ���� Runnable �ӿڵ�һ��ʵ����
		ThreadDemo1 t1 = new ThreadDemo1("thread-1");
		t1.start();
		ThreadDemo1 t2 = new ThreadDemo1("thread-2");
		t2.start();
	}

}
