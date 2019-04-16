package DesignPattern;

public class SingleTon {
	// ����ģʽ
	/*
	 * Singletonģʽ��Ҫ�����Ǳ�֤��JavaӦ�ó����У�һ����Classֻ��һ��ʵ�����ڡ� һ��Singletonģʽͨ���м�������ʽ: ��һ����ʽ:
	 * ����һ���࣬���Ĺ��캯��Ϊprivate�ģ�����һ��static��private�ĸ�������������ʼ��ʱʵ������
	 * ͨ��һ��public��getInstance������ȡ����������,�̶��������еķ�����
	 */
	// ��һ�ַ�ʽ
	private SingleTon() {
         //Ĭ�Ϲ��캯��
	}

	// ʵ�������ھ�̬����������߳����ִ�е�Ч�ʣ���Ҳ����ռ�ø���ռ䡣
	// ������private��ֻ���ڲ�ʹ��
	private final static SingleTon instance = new SingleTon();

	// �����ṩ��һ�����ⲿ���ʱ�class�ľ�̬����������ֱ�ӷ���
	public static SingleTon getInstance() {
		return instance;
	}

	// �ڶ��ַ�ʽ
    private static SingleTon instance2 =null;
    public static synchronized SingleTon getInstance2() {
    	//��������������иĽ�������ÿ�ζ����ɶ���ֻ�ǵ�һ��ʹ��ʱ������ɣ������Ч�ʣ�
    	if(instance2==null) {
    		instance2=new SingleTon();
    	}
    	return instance2;
    }
    //������ʽ�Ͳ�д�ˣ���һ����Ϊ��һ�ַ�ʽ����ȫЩ��
	public static void main(String[] args) {

	}

}
