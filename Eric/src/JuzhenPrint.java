
public class JuzhenPrint {

	public static void main(String[] args) {
		int a[][]=create(5,5);
		print(a);
		clockWisePrint(a,0,4);
	}
	private static void clockWisePrint(int [][] a,int i,int j) {
		if(j<i)
			return;
		if(i==j) {
			System.out.print(a[i][j]+" ");
			return;
		}
		int y=i;
		while(y<=j) {
			System.out.print(a[y][j]+" ");
	        y++;
	      }
		y=i+1;
		while(y<=j) {
			System.out.print(a[y][j]+" ");
			y++;
		}
		y=j-1;
		while(y>=i) {
			System.out.print(a[j][y]+" ");
			y--;
		}
		y=j-1;
		while(y>=i+1) {
			System.out.print(a[y][i]+" ");
			y--;
		}
		clockWisePrint(a,i+1,j-1);
	}
	private static void print(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");//打印每一行
			}
			System.out.println();//每一行打印后需要换行
		}	
	}
	public static int [][] create(int row,int line){
		int [][] a=new int[row][line];
		
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<line;j++) {
				a[i][j]=num++;
			}
		}
		return a;		
	}

}
