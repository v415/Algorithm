import java.util.LinkedHashMap;

public class CharFirstOnceNumber {

	public static void main(String[] args) {
		System.out.println("���ַ����е�һ��ֻ����һ�ε��ַ��ǣ�"+firstOnceNumber("addnooldfueojoddsfjoj"));
	}
    private static Character firstOnceNumber(String str) {
    	if(str==null) {
    		return null;//���Ϊ�յĴ���
    	}
    	char[] strChar=str.toCharArray();//תΪ�ַ�����
    	LinkedHashMap<Character,Integer> hash=new LinkedHashMap<Character,Integer>();
    	for(char c:strChar) {//����
    		if(hash.containsKey(c)) {
    			hash.put(c, hash.get(c)+1);
    		}
    		else hash.put(c, 1);
    	}
    	for(char key:hash.keySet()) {//���� ��˳��õ��ַ������ֵ
    		if(hash.get(key)==1)
    		return key;
    	}
    	return null;
    }
}
