	import java.util.*;

	public class HuaweiTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] strs = sc.nextLine().split(" ");

	        int n = Integer.parseInt(strs[0]);
	        List<String> list = new ArrayList<>();

	        for(int i=1;i<=n;i++){
	            String str = strs[i];
	            if(str.length()%8!=0){
	                str = str +"0000000";
	            }
	            while(str.length()>=8){
	                list.add(str.substring(0,8));
	                str = str.substring(8);
	            }
	        }

	        Collections.sort(list, new Comparator<String>() {
	            @Override
	            public int compare(String o1, String o2) {
	                return o1.compareTo(o2);
	            }
	        });
	        for(String e:list){
	            System.out.print(e+" ");
	        }

	    }
	}

