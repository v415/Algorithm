import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class JDdemoBuy {
	//采购单 http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3378&konwledgeId=41
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int goodsNum=0,buyNum=0;
        	ArrayList<Integer> price=new ArrayList<>();
        	HashMap<String,Integer> buylist=new HashMap<>();//购买的商品清单
        	goodsNum=sc.nextInt();//购物清单的商品数量
        	buyNum=sc.nextInt();//实际购买的商品数量
        	for(int i=0;i<goodsNum;i++) {
        		price.add(sc.nextInt());//存放商品价格
        	}        	
        	for(int j=0;j<buyNum;j++) {
        		String good=sc.next();//商品名称固然是字符串类型的
        		if(buylist.containsValue(good)) {//如果购物清单中包含某个商品，则加入购物清单
        			int count=buylist.get(good);
            		buylist.put(good, ++count);
        		}
        		else buylist.put(good, 1);
        	}
        	int maxValue=0;
        	int minValue=0;
        	//values()，values_list() 都是得到当前对象的所有字段或者指定字段的值。
        	Collection collection=buylist.values();//创建集合对象collection
        	ArrayList<Integer> list=new ArrayList<>(collection);//把集合collection转为ArrayList
        	Collections.sort(list);
        	Collections.sort(price);//对总价排序
            for(int i=0;i<list.size();i++) {
            	minValue +=list.get(list.size()-i-1)*price.get(i);
            	maxValue +=list.get(list.size()-i-1)*price.get(price.size()-i-1);
            }
            System.out.println(minValue+" "+maxValue+" ");
        }
	}

}
