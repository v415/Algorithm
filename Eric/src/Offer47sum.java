
public class Offer47sum {
/*
 * ����������֮�ͣ�����ʹ��+ - * /����
����λ������֪���磺5+17 
��һ��������λ��ӣ�����λ�������12  �ڶ���������λ����λֵΪ10  ���������ѽ����ӣ�10+22
*/
	public static void main(String[] args) {
		System.out.println("����������֮��Ϊ��");
		System.out.println(sum(23,25));		
	}
    private static int sum(int num1,int num2) {
    	while(num2!=0) {
    		//�����λ
    		int temp=num1^num2;
    		//�����λ
    		num2=(num1&num2)<<1;
    		num1=temp;
    	}
    	return num1;
    }
}
