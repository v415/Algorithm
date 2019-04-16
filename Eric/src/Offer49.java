
public class Offer49 {

	public static void main(String[] args) {
		System.out.println(strToInt("-325430d"));
	}
   private static int strToInt(String str) {
	   if(str==null||str.length()==0) {
		   return 0;
	   }
	   int mark=0;
	   int number=0;
	   char [] chars=str.toCharArray();
	   if(chars[0]=='-') 
		   mark = 1;	
	   for(int i=mark;i<chars.length;i++) {
		   if(chars[i]=='+') {
			   continue;
		   }
		   if(chars[i]<48||chars[i]>57) {
			   return 0;
		   }
		   number=number*10+chars[i]-48;
	   }
	   return mark==0?number:-number;
   }
}
