import java.util.Scanner;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// ´Ó¼üÅÌ½ÓÊÕ×Ö·û´®
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		while (sc.hasNext()) {
			int N = Integer.parseInt(sc.nextLine());
            String[] str=new String[100];
            
			for (int i = 0; i < N; i++) {
				str[i]= sc.nextLine();          
			}
			for(int i=0;i<N;i++) {
				StringBuilder sb=new StringBuilder(str[i]);
				if(str[i].length()%8!=0){
					for(int j=0;j<8-(str[i].length()%8);j++) {
						sb.append("0");
						
					}
					while(sb.length()>=8) {
						System.out.println(sb.substring(0, 8));
						sb=sb.delete(0, 8);
					}
				}
				else {
					while(sb.length()>=8) {
						System.out.println(sb.substring(0, 8));
						sb=sb.delete(0, 8);
					}
					System.out.println("000000000");
				}
			}
		}
	}

}
