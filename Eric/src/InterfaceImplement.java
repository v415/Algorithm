
public class InterfaceImplement implements InterfaceIntCompare {

	public static void main(String[] args) {
		InterfaceImplement IFI=new InterfaceImplement();   
        System.out.println(IFI.intCompare(3,2));
	}

	public int intCompare(int a, int b) {
		if (a < b)//�Ƚ�����������С������ϴ�ֵ
			return b;
		else if (a > b)
			return a;//����ʵ�ֽӿڷ���
		else
			return 0;
	}

}
