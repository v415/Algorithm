
public class ArrayMultiplication {

	public static void main(String[] args) {
		//�������
		int [][] a=new int[][] {{2,3,4},{4,6,8},{3,6,8}};
		int [][] b=new int[][] {{1,5,2,8},{5,9,10,3},{2,7,5,18}};
		int [][] c=new int[3][4];//����������
		int sum=0;
		for(int i=0;i<c.length;i++) {//����
			for(int j=0;j<c[i].length;j++)
			{//����
				sum=0;
				for(int k=0;k<a[i].length;k++) {
					sum+=a[i][k]*b[k][j];//2*1+3*5+4*2+0*8=25,��һ�е�һ��
				}
				 c[i][j]=sum;//�����������
				 System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}			

	}

}
