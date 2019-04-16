/*import java.util.Arrays;
import java.util.Scanner;

散散有一个特别好看的手链，这个手链一开始只有若干个珠子，我们用大写字母表示，例如AB，我们可以让珠子沿手链两个方向翻转复制，可以变成ABBA或者BAAB，假设AB变成ABBA，再复制一次就变成ABBAABBA，现在散散想知道需要至少需要多少个珠子，经过翻转复制后能变成现在的手链。例如：ABC，则至少需要ABC3个珠子。
 * 翻转数组：给定一个长度为n的整数数组a，元素均不相同，问数组是否存在这样一个片段，只将该片段翻转就可以使整个数组升序排列。
 * 其中数组片段[l,r]表示序列a[l], a[l+1], ..., a[r]。原始数组为
a[1], a[2], ..., a[l-2], a[l-1], a[l], a[l+1], ..., a[r-1], a[r], a[r+1], a[r+2], ..., a[n-1], a[n]，
将片段[l,r]反序后的数组是
a[1], a[2], ..., a[l-2], a[l-1], a[r], a[r-1], ..., a[l+1], a[l], a[r+1], a[r+2], ..., a[n-1], a[n]。

public class ArrayFanzhuan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int len = scanner.nextInt();
			int[] array = new int[len];
			int[] copy = new int[len];
			for (int i = 0; i < len; i++) {
				array[i] = scanner.nextInt();
				copy[i] = array[i];
			}
			Arrays.sort(copy);
			int left = 0, right = len - 1;// 定义两个“指针”
			while (left < len && copy[left] == array[left])
				left++;
			while (right >= 0 && copy[right] == array[right])
				right--;

			int i;
			for (i = 0; i <= right - left; i++) {
				if (copy[left + i] != array[right - i])
					break;
			}
			if (i > right - left)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}

请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码*****************************
    static String GetResult(String s) {
          

    }
*//******************************结束写代码******************************//*


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }
  
        res = GetResult(_s);
        System.out.println(res);
    }
    
    
    题目描述：
    黄警司和阿仁又在天台见面了，最近韩琛在查内鬼，所以他们俩今天来是要更换新的情报传输密码，每次阿仁会把情报写好，加密后传给黄警司。这次的加密方式很神奇：情报的长度为N，有一个长度为N的数组p，里面的数字各不相同（1<=i<=n,1<=p[i]<=n），然后对情报进行M次轮换。

    每次轮换是将情报中的第i个字符换到第p[i]个位置去。

    输入的情报长度不会超过n。如果长度没有到n就在后面补上空格到n。
    输入
    单组测试数据。

    第一行有一个整数n（0 < n <= 200）。

    第二行有n个整数，表示数组p。

    接下来有若干条情报要加密。

    每一条要加密的情报占一行，先输入一个整数m表示要轮换的次数，后面是要加密的情报，与m用一个空格分开。情报只由英文字母组成，是非空串。0<m<=200。

    当m=0的时候结束查询。

    输出
    对于每一个查询，输出加密后的情报，加密后的情报长度为n。


    样例输入
    2
    2 1
    1 AB
    2 CD
    0
    样例输出
    BA
    CD
    */