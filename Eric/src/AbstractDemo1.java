
public class AbstractDemo1 {

	/*public static void main(String[] args) {
		AbstractDemo1 ad=new AbstractDemo1();
		Animal a=new Cat();
		a.cry();
		

	}*/
	//���������
   abstract class Animal{
	   String name;
	   int age;
	   public abstract void cry();// ��ȷ��������ô�еġ�����ɳ��󷽷�����������෽���Ĳ�ȷ���ԡ�
	   //���󷽷��ڸ����в���ʵ�֣�����û�к����塣���ں����ڼ̳�ʱ��Ҫ����ʵ�ִ˷����� ���󷽷��Ķ��巽ʽ  
   }
   class Cat extends Animal{

	@Override
	public void cry() {
		System.out.println("è�У�������~");
		
	}
	   
   }
}
