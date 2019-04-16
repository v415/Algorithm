import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class JDdemoArray {
//给你两个集合，要求 {A} + {B}。 题目链接：http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3374&konwledgeId=41
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    while(sc.hasNext()) {
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	HashSet<Integer> hs=new HashSet<Integer>();//set不允许有重复元素
    	for(int i=0;i<n;i++) {
    		hs.add(sc.nextInt());//把输入的两个集合数存放在set集合
    	}
    	for(int j=0;j<m;j++) {
    		hs.add(sc.nextInt());
    	}
    	Object[] arr=hs.toArray();//将集合转为数组
    	int [] array=new int[arr.length];//定义整型数组，用于存放集合元素
    	for(int i=0;i<array.length;i++) {
    		array[i]=(int) arr[i];//
    	}
    	Arrays.sort(array);//对数组进行排序，从小到大
    	for(int i=0;i<array.length;i++) {
    		System.out.print(array[i]+" ");
    	}
    }
	}
	/*不能将Object[] 转化为Int []或String[]，转化的话只能是取出每一个元素再转化。
	 * java中的强制类型转换只是针对单个对象的，想要偷懒将整个数组转换成另外一种类型的数组是不行的，
	 * 这和数组初始化时需要一个个来也是类似的。像这样：
	Object[] arr = list.toArray();
	for (int i = 0; i < arr.length; i++) {
	    String e = (String) arr[i];
	    System.out.println(e);
	}*/
}
