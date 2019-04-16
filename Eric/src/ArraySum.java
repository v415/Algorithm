import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {	
		List<Integer> l=new ArrayList<>();
		l.add(11);
		l.add(3);l.add(4);l.add(7);
		System.out.println("数组sum(l):"+sum(l));
		
		List<Integer> ll=new ArrayList<>();
		ll.add(2);
		ll.add(5);ll.add(6);ll.add(8);
		System.out.println("数组sum(ll):"+sum(ll));
		
		List<Integer> lll=new ArrayList<>();
		lll.addAll(l);//当需要把多个List实例放到一起的时候，必须使用List.addAll()方法
		lll.addAll(ll);
		Collections.sort(lll);//list从小到大排序
		System.out.println(lll.toString());//打印排序结果
		System.out.println("两个数组数之和为:"+sum(lll));
		l=new ArrayList<>();
		ll=new ArrayList<>();
		int size=lll.size();
		for(int i=0;i<size;i=i+2) {//为什么是加2？？？--隔一个分一次，如：第一、第三、第五等数一起加，第二、第四、第六等数一起加
			if(l.size()<1&&ll.size()<1) {
				l.add(lll.get(i));//小的数
				ll.add(lll.get(i+1));//大的数，因为前面已经从小到大排序，所以索引大的对应的数也越大
				continue;
			}
			//集合大的先放小的数
			if(sum(l)>sum(ll)) {
				l.add(lll.get(i));
				ll.add(lll.get(i+1));
				continue;
			//集合大的先放小的数
			}else if(sum(l)<sum(ll)) {
				ll.add(lll.get(i));
				l.add(lll.get(i+1));
				continue;
			//一样大
			}else {
				l.add(lll.get(i));
				ll.add(lll.get(i+1));
				continue;
			}
			}
			int suml=sum(l);
			int sumll=sum(ll);
			System.out.print("两个数组之差是：");
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
