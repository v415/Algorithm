
public class Coins {

	public static void main(String[] args) {
		int totalMoney = 100;
		//ͳ�ƻ�������		
		int count = 0;
		// һ�ٿ�Ǯ����һ��Ӳ�ҡ�����Ӳ�Һ����Ӳ�ң����ж����ֻ���	
		for (int i = 1; i <= 100; i++) {			
			//ȡһ�ֵ�Ӳ��
			for (int j = 1; j <= 50; i++) {					
				//ȡ���ֵ�Ӳ��
				for (int k = 1; k <= 20; k++) {
					//ȡ��ֵ�Ӳ��				
					if (i * 1 + j * 2 + k * 5 == totalMoney) {	
						//�ж�Ǯ���Ƿ���100��
						System.out.println("һ��Ӳ���У�" + i + "����" + "����Ӳ���У�" + j + "����" + "���Ӳ���У�" + k + "��");
						count ++;
						System.out.println("һ����" + count + "�ֻ���");
					}		
				}
			}
		}
	}

}
