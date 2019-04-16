import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	  /*遍历map方式：尤其是容量大时
	  System.out.println("通过Map.entrySet遍历key和value");
	  for (Map.Entry<String, String> entry : map.entrySet()) {
	   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	  }  用 “shit+ctrl+/”会加上多行注释
	  */
	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("zhangsan", "tall");
		m1.put("lisi", "handsome");
		m1.put("wangergou", "short");
		//m1.keySet()获得m1 Map的所有value值  ---遍历map
		System.out.println(m1.keySet());
		System.out.println("-----------------");
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1, "张三");
		m2.put(2, "李四");
		m2.put(3, "王二狗");
		
		System.out.println(m2.keySet());
		System.out.println("-----------------");
		for(Object obj:m1.keySet()) {
			String s=m1.keySet().toString();		
			System.out.println(s);
			System.out.println(m1.get(obj));
		}
		
		for(int i:m2.keySet()) {			
			System.out.println(m2.get(i));
		}
	}

}
