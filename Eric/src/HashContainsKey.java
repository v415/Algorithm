import java.util.HashMap;
import java.util.Map;

public class HashContainsKey {
	/*
	 * Map集合允许值对象为null，并且没有个数限制，所以当get()方法的返回值为null时，
	 * 可能有两种情况，一种是在集合中没有该键对象，另一种是该键对象没有映射任何值对象，即值对象为null。
	 * 因此，在Map集合中不应该利用get()方法来判断是否存在某个键，而应该利用containsKey()方法来判断
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "新鲜苹果，好吃不贵，一元一个~~~");
		map.put("computer", "超薄笔记本电脑，不要999，只要99~~~");
		map.put("book", "人丑就要多读书~~~");
		String key = "book";
		if (map.containsKey(key)) {
			System.out.println("map中包含键名" + key);
		} else
			System.out.println("map中不包含键名" + key);
	}

}
