
public class Gouzao {

	String name;
	String sex;
	int age;

	public Gouzao() {
	}; // 定义无参构造方法

	public Gouzao(String n, String s, int a) { // 定义有参构造方法，参数为String n、String s、int a.
		name = n;
		sex = s;
		age = a;
	}

	void getInfo(String n, String s, int a) { // 定义方法getInfo(),获取学生的基本信息。
		name = n;
		sex = s;
		age = a;
	}

	void showInfo() { // 定义方法showInfo(),显示学生信息。
		System.out.println("姓名：" + name);
		System.out.println("性别：" + sex);
		System.out.println("年龄：" + age);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Gouzao stu1; // 定义属于类h的对象stu1.
		stu1 = new Gouzao(); // 进行实例化对象stu1.
		System.out.println("第一个人的信息");
		stu1.getInfo("王五", "男", 19);
		stu1.showInfo();
		System.out.println("第二个人的信息");
		Gouzao stu2 = new Gouzao("李四", "女", 20); // 定义和实例化对象stu2,并初始化stu2的学生信息。
		stu2.showInfo(); // 调用方法showInfo()
	}

}
