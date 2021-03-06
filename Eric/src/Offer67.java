
public class Offer67 {

	public static void main(String[] args) {
   
	}

	public int movingCount(int threshold, int rows, int cols) {
		int flag[][] = new int[rows][cols];
		return helper(0, 0, rows, cols, flag, threshold);
	}

	private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
		if (i < 0 || i > rows || j < 0 | j > cols || numSum(i) + numSum(j) > threshold || flag[i][j] == 1)
			return 0;
		flag[i][j] = 1;
		return helper(i - 1, j, rows, cols, flag, threshold) + helper(i + 1, j, rows, cols, flag, threshold)
				+ helper(i, j - 1, rows, cols, flag, threshold) + helper(i, j + 1, rows, cols, flag, threshold);
	}

	private int numSum(int i) {
		int sum = 0;
		while (i > 0) {
			sum += i % 10;
			i = i / 10;
		}
		return sum;
	}
}
