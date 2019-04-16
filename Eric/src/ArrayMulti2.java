
public class ArrayMulti2 {

	public static void main(String[] args) {
		int [] arr1= {2,3,5,1,8,23};
		int [] arr2= {1,3,35,1,8};
       System.out.print(mul(arr1,6)+" ");
       System.out.println(mul(arr2,5));
       compare(arr1,arr2);
       
	}
			public static int mul(int arr[],int n) {
				if(n<=1) {
					return arr[0];
				}
				else {
					return mul(arr,n-1)*arr[n-1];
				}
			}
			public static void compare(int arr1[],int arr2[]) {
				if(mul(arr1,6)<mul(arr2,5)) {
					System.out.println("数组arr1"+"的乘积较小");
				}
				else {
					System.out.println("数组arr2"+"的乘积较小");
				}

			}
}
