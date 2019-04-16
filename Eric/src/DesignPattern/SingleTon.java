package DesignPattern;

public class SingleTon {
	// 单例模式
	/*
	 * Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。 一般Singleton模式通常有几种种形式: 第一种形式:
	 * 定义一个类，它的构造函数为private的，它有一个static的private的该类变量，在类初始化时实例化，
	 * 通过一个public的getInstance方法获取对它的引用,继而调用其中的方法。
	 */
	// 第一种方式
	private SingleTon() {
         //默认构造函数
	}

	// 实例化放在静态代码块里可提高程序的执行的效率，但也可能占用更多空间。
	// 这里是private，只供内部使用
	private final static SingleTon instance = new SingleTon();

	// 这里提供了一个供外部访问本class的静态方法，可以直接访问
	public static SingleTon getInstance() {
		return instance;
	}

	// 第二种方式
    private static SingleTon instance2 =null;
    public static synchronized SingleTon getInstance2() {
    	//这个方法比上面有改进，不用每次都生成对象，只是第一次使用时候才生成，提高了效率！
    	if(instance2==null) {
    		instance2=new SingleTon();
    	}
    	return instance2;
    }
    //其他方式就不写了，但一般认为第一种方式更安全些。
	public static void main(String[] args) {

	}

}
