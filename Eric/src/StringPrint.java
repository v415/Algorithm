
public class StringPrint {

	public static void main(String[] args) {
		myPrint("abc");
	}
    private static void myPrint(String str) {
    	if(str==null) {
    		return;
    	}
    	char[] c=str.toCharArray();//תΪ�ַ�����
    	myPrint(c,0);
    }
	private static void myPrint(char[] str, int i) {//�����淽������
		if(i>=str.length)
			return;
		if(i==str.length-1) {
			System.out.println(String.valueOf(str));//תΪ�ַ���
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
