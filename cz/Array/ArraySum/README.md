# 题目描述：
写一个方法/函数 maxSubArraySum
Input: 整型数组，数字有正有负
Output: 子序列的最大和

## Ex：
	Input: -3, -2, -1, 1, 2, 3, -10
	Ouput: 6 （对应子序列为1,2,3）

## 熟悉一下Integer的一些用法
1、Integer.parseInt(String s) 字符串转整型<br>
2、Integer.parseInt(String s, int radix) 字符串s，进制数，将字符串转化为radix数<br>
3、Integer.toString（）<br>
​      第一个toString方法很简单，就是先用stringSize得到数字是多少位，再用getChars获取数字对应的char数组，最后返回一个String类型。<br>      第二个更简单了，就是调用第一个toString方法。<br>      第三个toString方法是带了进制信息的，它会转换成对应进制的字符串。不在2到36进制范围之间的都会按照10进制处理。<br>
4、Integer.reverse(int i)  将i进行反转。

