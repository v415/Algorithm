import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {	
		List<Integer> l=new ArrayList<>();
		l.add(11);
		l.add(3);l.add(4);l.add(7);
		System.out.println("����sum(l):"+sum(l));
		
		List<Integer> ll=new ArrayList<>();
		ll.add(2);
		ll.add(5);ll.add(6);ll.add(8);
		System.out.println("����sum(ll):"+sum(ll));
		
		List<Integer> lll=new ArrayList<>();
		lll.addAll(l);//����Ҫ�Ѷ��Listʵ���ŵ�һ���ʱ�򣬱���ʹ��List.addAll()����
		lll.addAll(ll);
		Collections.sort(lll);//list��С��������
		System.out.println(lll.toString());//��ӡ������
		System.out.println("����������֮��Ϊ:"+sum(lll));
		l=new ArrayList<>();
		ll=new ArrayList<>();
		int size=lll.size();
		for(int i=0;i<size;i=i+2) {//Ϊʲô�Ǽ�2������--��һ����һ�Σ��磺��һ���������������һ��ӣ��ڶ������ġ���������һ���
			if(l.size()<1&&ll.size()<1) {
				l.add(lll.get(i));//С����
				ll.add(lll.get(i+1));//���������Ϊǰ���Ѿ���С������������������Ķ�Ӧ����ҲԽ��
				continue;
			}
			//���ϴ���ȷ�С����
			if(sum(l)>sum(ll)) {
				l.add(lll.get(i));
				ll.add(lll.get(i+1));
				continue;
			//���ϴ���ȷ�С����
			}else if(sum(l)<sum(ll)) {
				ll.add(lll.get(i));
				l.add(lll.get(i+1));
				continue;
			//һ����
			}else {
				l.add(lll.get(i));
				ll.add(lll.get(i+1));
				continue;
			}
			}
			int suml=sum(l);
			int sumll=sum(ll);
			System.out.print("��������֮���ǣ�");
			System.out.println(suml>sumll?suml-sumll:sumll-suml);
		}
	public static int sum(List<Integer> list) {
		int sum=0;
		for(int num:list) {
			sum +=num;
		}
		return sum;
	}

}
