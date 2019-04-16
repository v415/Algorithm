import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class JDdemoBuy {
	//�ɹ��� http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3378&konwledgeId=41
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int goodsNum=0,buyNum=0;
        	ArrayList<Integer> price=new ArrayList<>();
        	HashMap<String,Integer> buylist=new HashMap<>();//�������Ʒ�嵥
        	goodsNum=sc.nextInt();//�����嵥����Ʒ����
        	buyNum=sc.nextInt();//ʵ�ʹ������Ʒ����
        	for(int i=0;i<goodsNum;i++) {
        		price.add(sc.nextInt());//�����Ʒ�۸�
        	}        	
        	for(int j=0;j<buyNum;j++) {
        		String good=sc.next();//��Ʒ���ƹ�Ȼ���ַ������͵�
        		if(buylist.containsValue(good)) {//��������嵥�а���ĳ����Ʒ������빺���嵥
        			int count=buylist.get(good);
            		buylist.put(good, ++count);
        		}
        		else buylist.put(good, 1);
        	}
        	int maxValue=0;
        	int minValue=0;
        	//values()��values_list() ���ǵõ���ǰ����������ֶλ���ָ���ֶε�ֵ��
        	Collection collection=buylist.values();//�������϶���collection
        	ArrayList<Integer> list=new ArrayList<>(collection);//�Ѽ���collectionתΪArrayList
        	Collections.sort(list);
        	Collections.sort(price);//���ܼ�����
            for(int i=0;i<list.size();i++) {
            	minValue +=list.get(list.size()-i-1)*price.get(i);
            	maxValue +=list.get(list.size()-i-1)*price.get(price.size()-i-1);
            }
            System.out.println(minValue+" "+maxValue+" ");
        }
	}

}
