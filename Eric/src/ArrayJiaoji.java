import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayJiaoji {
	//������ѭ������������Ľ������������
	public static void main(String[] args) {
		Integer []a= {1,2,3,4,5,6};
		Integer []b= {3,4,7,8,9};
		System.out.println("-------����-------");
        Integer c[]=getJiaoji(a,b);
        for(Integer i:c) {//ѭ����������c��ֵ
        	System.out.println(i);       	
        }
        System.out.println("-------����-------");
        Integer d[]=getBingji(a,b);
        for(Integer i:d) {
        	System.out.println(i);
        }
        System.out.println("-------�-------");
        Integer e[]=getBingji(a,b);
        for(Integer i:e) {
        	System.out.println(i);
        }
        
	}
   //����
	public static Integer[] getJiaoji(Integer a[],Integer b[]) {
		List<Integer> rs=new ArrayList<Integer>();
		//���ϳ�������ת��Ϊset  Set������List : �������  Set : ���򲻿���
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(a.length>b.length?b:a));
		//Arrays.asList������������		
		//�����϶̵����飬ʵ������ѭ��
		for(Integer i:a.length>b.length?b:a) {
			if(set.contains(i)) {
				rs.add(i);
			}
		}
		Integer arr[]= { };//����һ������Integer������
		return rs.toArray(arr);
	}
	//����
	private static Integer[] getBingji(Integer m[],Integer n[]) {
		Set<Integer> set1=new HashSet<Integer>(Arrays.asList(m));//����m���� Arrays.asList()���������ڶ��������ݵ����飨String��Integer...��
		Set<Integer> set2=new HashSet<Integer>(Arrays.asList(n));
		set1.addAll(set2);//�ϲ���������
		Integer[] arr= {};
		return set1.toArray(arr);//�ǽ������е�����װ�봴����������(��������˼��ϴ�Сͬ��)
	}
	//�
	private static Integer[] getChaji(Integer m[],Integer n[]) {
		// ���ϳ�������ת��Ϊset
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(m.length>n.length?m:n));
		//�����϶̵����飬ʵ������ѭ��
		for(Integer i:m.length>n.length?n:m) {
			// �������������ͬ�ľ�ɾ�������û�оͽ�ֵ��ӵ�����
			if(set.contains(i)) {
				set.remove(i);				
			}
			else {
				set.add(i);
			}
		}
		Integer arr[] = {};
		return set.toArray(arr);
	}
}
