import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayJiaoji {
	//用最少循环求两个数组的交集、差集、并集
	public static void main(String[] args) {
		Integer []a= {1,2,3,4,5,6};
		Integer []b= {3,4,7,8,9};
		System.out.println("-------交集-------");
        Integer c[]=getJiaoji(a,b);
        for(Integer i:c) {//循环遍历数组c的值
        	System.out.println(i);       	
        }
        System.out.println("-------并集-------");
        Integer d[]=getBingji(a,b);
        for(Integer i:d) {
        	System.out.println(i);
        }
        System.out.println("-------差集-------");
        Integer e[]=getBingji(a,b);
        for(Integer i:e) {
        	System.out.println(i);
        }
        
	}
   //交集
	public static Integer[] getJiaoji(Integer a[],Integer b[]) {
		List<Integer> rs=new ArrayList<Integer>();
		//将较长的数组转换为set  Set有序吗？List : 有序可重  Set : 无序不可重
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(a.length>b.length?b:a));
		//Arrays.asList（）遍历数组		
		//遍历较短的数组，实现最少循环
		for(Integer i:a.length>b.length?b:a) {
			if(set.contains(i)) {
				rs.add(i);
			}
		}
		Integer arr[]= { };//定义一个整型Integer空数组
		return rs.toArray(arr);
	}
	//并集
	private static Integer[] getBingji(Integer m[],Integer n[]) {
		Set<Integer> set1=new HashSet<Integer>(Arrays.asList(m));//遍历m数组 Arrays.asList()方法适用于对象型数据的数组（String、Integer...）
		Set<Integer> set2=new HashSet<Integer>(Arrays.asList(n));
		set1.addAll(set2);//合并两个集合
		Integer[] arr= {};
		return set1.toArray(arr);//是将集合中的内容装入创建的数组中(此数组与此集合大小同等)
	}
	//差集
	private static Integer[] getChaji(Integer m[],Integer n[]) {
		// 将较长的数组转换为set
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(m.length>n.length?m:n));
		//遍历较短的数组，实现最少循环
		for(Integer i:m.length>n.length?n:m) {
			// 如果集合里有相同的就删掉，如果没有就将值添加到集合
			if(set.contains(i)) {
				set.remove(i);				
			}
			else {
				set.add(i);
			}
		}
		Integer arr[] = {};
		return set.toArray(arr);
	}
}
