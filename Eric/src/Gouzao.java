
public class Gouzao {

	String name;
	String sex;
	int age;

	public Gouzao() {
	}; // �����޲ι��췽��

	public Gouzao(String n, String s, int a) { // �����вι��췽��������ΪString n��String s��int a.
		name = n;
		sex = s;
		age = a;
	}

	void getInfo(String n, String s, int a) { // ���巽��getInfo(),��ȡѧ���Ļ�����Ϣ��
		name = n;
		sex = s;
		age = a;
	}

	void showInfo() { // ���巽��showInfo(),��ʾѧ����Ϣ��
		System.out.println("������" + name);
		System.out.println("�Ա�" + sex);
		System.out.println("���䣺" + age);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Gouzao stu1; // ����������h�Ķ���stu1.
		stu1 = new Gouzao(); // ����ʵ��������stu1.
		System.out.println("��һ���˵���Ϣ");
		stu1.getInfo("����", "��", 19);
		stu1.showInfo();
		System.out.println("�ڶ����˵���Ϣ");
		Gouzao stu2 = new Gouzao("����", "Ů", 20); // �����ʵ��������stu2,����ʼ��stu2��ѧ����Ϣ��
		stu2.showInfo(); // ���÷���showInfo()
	}

}
