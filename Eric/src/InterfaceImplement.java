
public class InterfaceImplement implements InterfaceIntCompare {

	public static void main(String[] args) {
		InterfaceImplement IFI=new InterfaceImplement();   
        System.out.println(IFI.intCompare(3,2));
	}

	public int intCompare(int a, int b) {
		if (a < b)//比较两个整数大小，输出较大值
			return b;
		else if (a > b)
			return a;//具体实现接口方法
		else
			return 0;
	}

}
