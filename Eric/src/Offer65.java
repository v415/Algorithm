import java.util.ArrayList;

public class Offer65 {
    //����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ
	public static void main(String[] args) {
		int []num= {1,223,2,44,23,52};
        System.out.println(maxInWindows(num,3));
	}
	public static ArrayList<Integer> maxInWindows(int []num,int size){
	    ArrayList<Integer> list=new ArrayList<>();
	    if(num==null||size<1||num.length<size) {
	    	return list;
	    }
	    int length=num.length-size+1;
	    for(int i=0;i<length;i++) {//ע�������ѭ������
	    	int current=size+i;//���ƻ�������
	    	int max=num[i];//��ʼ��ֵΪ��һ����ֵ
	    	for(int j=i;j<current;j++) {
	    		if(max<num[j]) {
	    			max=num[j];//�ȽϽ���
	    		}
	    	}
		    list.add(max);
	    }
		return list;
	}

}
