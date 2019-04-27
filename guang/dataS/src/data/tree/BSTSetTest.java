package data.tree;

import java.util.ArrayList;
import data.set.BSTSet;
import data.set.FileOperation;

public class BSTSetTest {

	public static void main(String[] args) {
		System.out.println("/双城记(英文版).TXT");
		
		ArrayList<String> words1=new ArrayList<>();
		FileOperation.readFile("d:\\shuang.txt", words1);
		System.out.println("total words:"+words1.size());
		BSTSet<String> set=new BSTSet<>();
		//LinkedListSet<String> set =new LinkedListSet<>();
		for (String word : words1) {
			set.add(word);
		}
		System.out.println(set.getSize());

	}
	

}
