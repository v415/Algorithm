
public class IntegerPrint {

	public static void main(String[] args) {
	Integer a=125;
	Integer b=125;
	System.out.println(a==b);//true
    System.out.println(",");
    Integer c=321;
    Integer d=321;
    System.out.println(c==d);// false
    //涉及到常量池知识 在-128和127之间的时候integer不会new新对象 a==b为true 
    //超过127就会自动new一个对象 这时候就为c==d就为false了
    
    String s1="I love";
	String s2=" you！";
	System.out.println(s1+s2);//字符串连接test
	}

}
