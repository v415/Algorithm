import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	  /*����map��ʽ��������������ʱ
	  System.out.println("ͨ��Map.entrySet����key��value");
	  for (Map.Entry<String, String> entry : map.entrySet()) {
	   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	  }  �� ��shit+ctrl+/������϶���ע��
	  */
	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("zhangsan", "tall");
		m1.put("lisi", "handsome");
		m1.put("wangergou", "short");
		//m1.keySet()���m1 Map������valueֵ  ---����map
		System.out.println(m1.keySet());
		System.out.println("-----------------");
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1, "����");
		m2.put(2, "����");
		m2.put(3, "������");
		
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
