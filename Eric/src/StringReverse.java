
public class StringReverse {

	public static void main(String[] args) {
		String str = "I am a student.";
	    String str1 = wordsReverse(str);
	    //输出为student a am I
	    System.out.println(str1);
	}

	public static String wordsReverse(String str) {
		// 字符串变为字符串数组
		String[] strArr = str.split("");
		// 创建新字符串数组，长度等于原来字符串数组的长度，用来存储反转的后的字符串。
		String[] strArr1 = new String[strArr.length];
		// 将反转后的字符串数组编程字符串
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArr.length; i++) {
			// 逆序赋值给字符串数组strArr1
			strArr1[i] = strArr[strArr.length - i - 1];

			// 如果不是最后一个单词则追加该单词和空格，最后一个则只追加该单词
			if (i != strArr.length - 1) {
				sb.append(strArr1[i]);
				sb.append(" ");
			} else
				sb.append(strArr1[i]);
		}
		return sb.toString();
	}
}
