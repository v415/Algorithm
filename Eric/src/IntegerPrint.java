
public class IntegerPrint {

	public static void main(String[] args) {
	Integer a=125;
	Integer b=125;
	System.out.println(a==b);//true
    System.out.println(",");
    Integer c=321;
    Integer d=321;
    System.out.println(c==d);// false
    //�漰��������֪ʶ ��-128��127֮���ʱ��integer����new�¶��� a==bΪtrue 
    //����127�ͻ��Զ�newһ������ ��ʱ���Ϊc==d��Ϊfalse��
    
    String s1="I love";
	String s2=" you��";
	System.out.println(s1+s2);//�ַ�������test
	}

}
