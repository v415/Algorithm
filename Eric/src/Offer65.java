import java.util.ArrayList;

public class Offer65 {
    //给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值
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
	    for(int i=0;i<length;i++) {//注意这里的循环条件
	    	int current=size+i;//控制滑动窗口
	    	int max=num[i];//初始赋值为第一个数值
	    	for(int j=i;j<current;j++) {
	    		if(max<num[j]) {
	    			max=num[j];//比较交换
	    		}
	    	}
		    list.add(max);
	    }
		return list;
	}

}
