
public class HuiwenTest {
	//字符串回文判断法
		     public static boolean isHuiWen(String text) {
		    	 
		         int length = text.length();
		         //前后一半各自比较
		         for (int i = 0; i < length / 2; i++) {
		        	// toCharArray()转为字符数组 前后相对应比较是否相同  
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
