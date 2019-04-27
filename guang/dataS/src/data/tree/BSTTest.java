package data.tree;

import java.util.ArrayList;
import java.util.Random;

public class BSTTest {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>(); 
		BST<Integer> bst=new BST<>();
		int n=1000;
		for (int i = 1; i < n; i++) {
			bst.add(random.nextInt(1000));
		}
		while(!bst.isEmpty()) {
			list.add(bst.removeMin());
		}
		System.out.println(list);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i-1)>list.get(i)) {
				throw new IllegalArgumentException("error");
			}
		}
		System.out.println("test  removeMin completed");
		
		//test removeMax
		for (int i = 1; i < n; i++) {
			bst.add(random.nextInt(10000));
		}
		 list = new ArrayList<>(); 
		while(!bst.isEmpty()) {
			list.add(bst.removeMax());
		}
		System.out.println(list);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i-1)<list.get(i)) {
				throw new IllegalArgumentException("error");
			}
		}
		System.out.println("test  removeMax completed");
		//test remove
		 bst=new BST<>();
		for (int i = 1; i < 10; i++) {
			bst.add(i);
		}
		System.out.println(bst);
		bst.remove(3);
		System.out.println(bst);
		
	}
}
