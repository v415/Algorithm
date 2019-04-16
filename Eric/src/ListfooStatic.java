import java.util.ArrayList;
import java.util.List;

public class ListfooStatic {
	
	public static void foo1(List<Integer> list) {
		list.add(3);
	}

	public static void foo2(List<Integer> list) {
		list = new ArrayList<>();//指向了新的地址
		list.add(4); //添加以后不会传给main方法
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		foo1(list);	  
	    System.out.println(list);//输出结果：【1,2,3】
	    foo2(list);	    
	    System.out.println(list);//输出结果：【1,2,3】
	    
	}

}
