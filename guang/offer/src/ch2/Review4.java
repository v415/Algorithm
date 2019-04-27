package ch2;

public class Review4 {

	static Boolean find(int arr[][],int target) {
		int rows = arr.length; // 数组的行数
        int cols = arr[1].length; // 数组行的列数
        
        int row =0;
        int col = cols-1;
        while(row<rows && col>=0) {
        	if (arr[row][col]==target) {
				return true;
			}else if (arr[row][col]>target) {
				col--;
			}else {
				row++;
			}
        }
		return false;
		
	}
	public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(matrix, 7));    // 要查找的数在数组中
        System.out.println(find(matrix, 5));    // 要查找的数不在数组中
}}
