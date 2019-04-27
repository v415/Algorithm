package ch2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//评测题目: 1.输入一个字符串，找出其中重复次数最多的子集(大于等于3个字符)，例如
//abcdabceabc，中重复最多的是abc。只包括小写字母
//2. 对程序的正确性写出相关用例
public class test {
	public static List<String> find(String str) {
		String subStr = null;
		List<String> listStr = new ArrayList<>();
		if (str.length() < 3) {
			return null;
			// throw new RuntimeException("null");
		}
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length() - 3; i++) {
			int k = i;
			String str1 = str.substring(i, i + 3);
			String str2 = str.substring(i + 3);
			while (str2.contains(str1)) {
				int cnt = 1;
				String temp = str2;
				while (temp.contains(str1)) {
					cnt++;
					temp = temp.substring(temp.indexOf(str1) + str1.length());
				}
				if (!map.containsKey(str1)) {
					map.put(str1, cnt);
					k++;
					str1 = str.substring(i, k + 3);
					str2 = str.substring(k + 3);
				}
			}
		}

		if (map.isEmpty()) {
			return null;

		}

		List<Integer> list = new ArrayList<Integer>();

		// PriorityQueue<Integer, String> q=new PriorityQueue<>();
		for (String key : map.keySet()) {
			int value = map.get(key);
			list.add(value);
		}

		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			int size = list.get(i);
			max = (max > size) ? max : size;
		}
		for (String key : map.keySet()) {
			if (max == map.get(key)) {
				subStr = key;
				listStr.add(key);
			}
		}
		return listStr;
	}

	public static void main(String[] args) {
		List<String> subStr = find("asdfgasdabcabc");
		if (subStr == null) {
			System.out.println("null");
		} else {
			for (String str : subStr) {
				System.out.println(str);
			}
		}

		/*
		 * find("as"); find("asdfgasd"); find("");
		 */
//find("45*&(knm45p");
//find("asdfgasdasd");
		/*
		 * find("asd"); find("asdf"); find("asd");
		 */

	}

	/**
	 * 输入 预期输出 as 空 asdfgasd asd 空字符串 空 45*&(knm45p asdfgasdasd asd asd asd asdf
	 * asdf或asd或sdf
	 * 
	 **/

}