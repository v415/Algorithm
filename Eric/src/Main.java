import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<String> list = new ArrayList();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String str = sc.nextLine();
		String[] strs = str.split(" ");
		int n = Integer.parseInt(strs[0]);
		
		//int n=2;
		//String[] strs = {"2","123456789","abc"};
		for(int i=1;i<=n;i++){
			splitString(strs[i]);
		}
		strSort(list);
		for(String i:list)
			System.out.print(i+" ");
		
	}
	private static void splitString(String string) {
		char[] arr = string.toCharArray();
		if(arr.length>8){
			int t = arr.length/8;
			for(int i=0;i<t;i++){
				char[] arr1 = Arrays.copyOfRange(arr, 8*i, 8*(i+1));
				Arrays.sort(arr1);
				list.add(new String(arr1));
			}
			if(arr.length-8*t>0){
				char[] arr2 = Arrays.copyOfRange(arr, 8*t, arr.length);
				String str =new String(arr2);
				for(int i=arr2.length;i<8;i++)
					str+="0";
				list.add(str);
			}
		}else if(arr.length<=8){
			String str =new String(arr);
			for(int i=arr.length;i<8;i++)
				str+="0";
			list.add(str);
		}
	}
	public static void strSort(List<String> list){
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).compareTo(list.get(j))>0){
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);					
				}
			}
		}
	}
   
}
