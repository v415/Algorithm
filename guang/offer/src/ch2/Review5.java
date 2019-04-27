package ch2;
/**
 * 替换空格
 * @author yzg
 *
 */
public class Review5 {
	public static String replaceSpace(StringBuffer str) {
		/**
		 * length()方法和capacity()方法都是获取StringBuffer的长度。 
		 *	length()返回字符串的实际长度； 
		 *	capacity()返回字符串所占容器的总大小。
		 *计算newLength后一定要对str进行扩容，不然就会越界!!!
		 */
		int length=str.length();
		if (str==null&&length<=0) {
			return null;
		}
		
		int numberOfBlank=0;
		for (int i = 0; i < length; i++) {
			if (str.charAt(i)==' ') {
				numberOfBlank++;
			}
			
		}
		int newLength=length+numberOfBlank*2;
		str.setLength(newLength);//使str的长度扩大到转换成%20之后的长度,防止下标越界
		if (newLength>str.capacity()) {
			return null;
		}
		int indexOfOriginal=length-1;
		int indexOfNew=newLength-1;
		
		while (indexOfOriginal>=0 && indexOfNew>indexOfOriginal) {
			if (str.charAt(indexOfOriginal)==' ') {
				str.setCharAt(indexOfNew--, '0');
				str.setCharAt(indexOfNew--, '2');
				str.setCharAt(indexOfNew--, '%');
			}else {
				str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal));
			}
			indexOfOriginal--;
			
		}
		return str.toString();
    	
    }
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello world  hehe ");
		System.out.println(replaceSpace(sb));
	}
}
