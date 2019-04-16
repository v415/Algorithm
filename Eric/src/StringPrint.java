
public class StringPrint {

	public static void main(String[] args) {
		myPrint("abc");
	}
    private static void myPrint(String str) {
    	if(str==null) {
    		return;
    	}
    	char[] c=str.toCharArray();//转为字符数组
    	myPrint(c,0);
    }
	private static void myPrint(char[] str, int i) {//与上面方法重载
		if(i>=str.length)
			return;
		if(i==str.length-1) {
			System.out.println(String.valueOf(str));//转为字符串
		}
		else {
			for(int j=i;j<str.length;j++) {
				char temp=str[j];
				str[j]=str[i];
				str[i]=temp;
				myPrint(str,i+1);
				
				temp=str[j];
				str[j]=str[i];
				str[i]=temp;
			}
		}
		
	}
}
