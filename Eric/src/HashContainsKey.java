import java.util.HashMap;
import java.util.Map;

public class HashContainsKey {
	/*
	 * Map��������ֵ����Ϊnull������û�и������ƣ����Ե�get()�����ķ���ֵΪnullʱ��
	 * ���������������һ�����ڼ�����û�иü�������һ���Ǹü�����û��ӳ���κ�ֵ���󣬼�ֵ����Ϊnull��
	 * ��ˣ���Map�����в�Ӧ������get()�������ж��Ƿ����ĳ��������Ӧ������containsKey()�������ж�
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "����ƻ�����óԲ���һԪһ��~~~");
		map.put("computer", "�����ʼǱ����ԣ���Ҫ999��ֻҪ99~~~");
		map.put("book", "�˳��Ҫ�����~~~");
		String key = "book";
		if (map.containsKey(key)) {
			System.out.println("map�а�������" + key);
		} else
			System.out.println("map�в���������" + key);
	}

}
