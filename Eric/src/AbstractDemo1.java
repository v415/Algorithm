
public class AbstractDemo1 {

	/*public static void main(String[] args) {
		AbstractDemo1 ad=new AbstractDemo1();
		Animal a=new Cat();
		a.cry();
		

	}*/
	//定义抽象类
   abstract class Animal{
	   String name;
	   int age;
	   public abstract void cry();// 不确定动物怎么叫的。定义成抽象方法，来解决父类方法的不确定性。
	   //抽象方法在父类中不能实现，所以没有函数体。但在后续在继承时，要具体实现此方法。 抽象方法的定义方式  
   }
   class Cat extends Animal{

	@Override
	public void cry() {
		System.out.println("猫叫，喵喵喵~");
		
	}
	   
   }
}
