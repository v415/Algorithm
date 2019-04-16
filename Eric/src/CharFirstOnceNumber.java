import java.util.LinkedHashMap;

public class CharFirstOnceNumber {

	public static void main(String[] args) {
		System.out.println("该字符串中第一个只出现一次的字符是："+firstOnceNumber("addnooldfueojoddsfjoj"));
	}
    private static Character firstOnceNumber(String str) {
    	if(str==null) {
    		return null;//如果为空的处理
    	}
    	char[] strChar=str.toCharArray();//转为字符数组
    	LinkedHashMap<Character,Integer> hash=new LinkedHashMap<Character,Integer>();
    	for(char c:strChar) {//遍历
    		if(hash.containsKey(c)) {
    			hash.put(c, hash.get(c)+1);
    		}
    		else hash.put(c, 1);
    	}
    	for(char key:hash.keySet()) {//遍历 按顺序得到字符数组的值
    		if(hash.get(key)==1)
    		return key;
    	}
    	return null;
    }
}
