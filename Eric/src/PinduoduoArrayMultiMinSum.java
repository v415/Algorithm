import java.util.Scanner;

public class PinduoduoArrayMultiMinSum {
	/*
	 * 给出长度都为n的两个整数数组a[n]和b[n]，特殊运算S=a[0]*b[0] + ... + a[n-1]*b[n-1]，
	 * 你可以改变a数组的顺序使得运算S得到的值最小，给出最终的最小值。数组长度n不大于50，对于每个元素x，0<=X<=100。 输入描述: 一共三行。
	 * 第一行为n，表示两个数组的长度。 第二行包括n个数字，用空格隔开，是a数组的值。 第三行包括n个数字，用空格隔开，是b数组的值。 输出描述:
	 * 输出一行，包含一个数字，表示最小的S值。 示例1输入输出示例仅供调试，后台判题数据一般不包含示例
	 *  输入: 3 1 1 3 10 30 20 输出:80
	 */
	/* 通过键盘接收数字给数组
	 * public static void main(String args[]) {
	    //定义Integer数组，默认值为10个null
	   Integer[] readNums = new Integer[10];
	    //使用Scanner的sytem in流
	   Scanner sca = new Scanner(System.in);
	   for(int i=0;i<10;i++){
	        //读取数字放入数组的第i个元素
	       readNums[i]=sca.nextInt();
	   }
	}*/
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		System.out.println("请输入数组长度length：");
		int length = s1.nextInt();				
		int arr1[] = null;
		int arr2[]= null;
		System.out.println("请输入第一个数组的值，用逗号分隔：");
		for(int i=0;i<length;i++) {		
			//int arr1num = s2.nextInt();
			//arr1[length]=arr1num;
			arr1[length]=s2.nextInt();
		}
		System.out.println("请输入第二个数组的值，用逗号分隔：");
		for(int j=0;j<length;j++) {	
			//int arr2num = s3.nextInt();
			//arr2[length]=arr2num;
			arr2[length]=s2.nextInt();
		}
		arrayMultiMin(arr1,arr2);
	}

	public static int arrayMultiMin(int arr1[], int arr2[]) {
		int S = 0;		
		for (int i = 0; i <= arr1.length; i++)
			for (int j = 0; j <= arr2.length; j++) {
				S += arr1[i] * arr2[j];
			}
		return S;
	}

}
