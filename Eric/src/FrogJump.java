
public class FrogJump {
/*offer 9-2
 * һֻ����һ�ο�������1����2��̨�ף�
 * ����������һ��n��̨��һ���ж�����������
 * */
	public static void main(String[] args) {
		System.out.println(getMethodNumber(10));//����̨��Ϊ10
	}
   private static int getMethodNumber(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	if(n==2) {
		return 2;
	}
	return getMethodNumber(n-1)+getMethodNumber(n-2);//�ݹ����
	   
   }
}
