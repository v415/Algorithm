
public class Offer55 {

	
	static char [] chars=new char[256];
	static StringBuilder sb=new StringBuilder();
    public static  void Insert(char ch) {
    	sb.append(ch);
    	chars[ch]++;
    }
    public static char FirstAppearingOnce() {
    	char[] str=sb.toString().toCharArray();
    	for(char c:str) {
    		if(chars[c]==1) {
    			return c;
    		}
    	}
    	return '#';
    }
   /* public static void main(String[] args) {
    	Insert('c'); //如何调用
    	FirstAppearingOnce();
    	System.out.println();
    	}*/
}
