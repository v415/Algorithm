import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class JDdemoArray {
//�����������ϣ�Ҫ�� {A} + {B}�� ��Ŀ���ӣ�http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3374&konwledgeId=41
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    while(sc.hasNext()) {
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	HashSet<Integer> hs=new HashSet<Integer>();//set���������ظ�Ԫ��
    	for(int i=0;i<n;i++) {
    		hs.add(sc.nextInt());//����������������������set����
    	}
    	for(int j=0;j<m;j++) {
    		hs.add(sc.nextInt());
    	}
    	Object[] arr=hs.toArray();//������תΪ����
    	int [] array=new int[arr.length];//�����������飬���ڴ�ż���Ԫ��
    	for(int i=0;i<array.length;i++) {
    		array[i]=(int) arr[i];//
    	}
    	Arrays.sort(array);//������������򣬴�С����
    	for(int i=0;i<array.length;i++) {
    		System.out.print(array[i]+" ");
    	}
    }
	}
	/*���ܽ�Object[] ת��ΪInt []��String[]��ת���Ļ�ֻ����ȡ��ÿһ��Ԫ����ת����
	 * java�е�ǿ������ת��ֻ����Ե�������ģ���Ҫ͵������������ת��������һ�����͵������ǲ��еģ�
	 * ��������ʼ��ʱ��Ҫһ������Ҳ�����Ƶġ���������
	Object[] arr = list.toArray();
	for (int i = 0; i < arr.length; i++) {
	    String e = (String) arr[i];
	    System.out.println(e);
	}*/
}
