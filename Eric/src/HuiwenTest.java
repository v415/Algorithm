
public class HuiwenTest {
	//�ַ��������жϷ�
		     public static boolean isHuiWen(String text) {
		    	 
		         int length = text.length();
		         //ǰ��һ����ԱȽ�
		         for (int i = 0; i < length / 2; i++) {
		        	// toCharArray()תΪ�ַ����� ǰ�����Ӧ�Ƚ��Ƿ���ͬ  
		             if (text.toCharArray()[i] != text.toCharArray()[length - i - 1])
		             {
		                  return false;
		             }
		          }
		          return true;
		     }
		     
		     public static void main(String[] args) {		 
		         String text = "abccba";
		         System.out.println(isHuiWen(text));
		     }
}
