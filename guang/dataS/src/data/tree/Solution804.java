package data.tree;

import java.util.Set;
import java.util.TreeSet;

public class Solution804 {
	 public int uniqueMorseRepresentations(String[] words) {
			Set<String> set =new TreeSet<>();
			String[] arr= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
			for(String word : words) {
				StringBuilder sb=new StringBuilder();
				for (int i = 0; i < word.length(); i++) {
					sb.append(arr[word.charAt(i)-'a']);
				}
				set.add(sb.toString());
			}
			return set.size();
		        
		    }

}
