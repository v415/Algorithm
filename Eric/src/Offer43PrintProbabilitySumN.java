
public class Offer43PrintProbabilitySumN {
//offer43 
	private static int i;
	public static void main(String[] args) {
		

	}
	private static void printProbability(int num) {
		if(num <1) {
			return;
		}
		int MaxValue=6;
		int [][] probabilities=new int [2][];
		probabilities [0]=new int [MaxValue*num+1];
		probabilities [1]=new int [MaxValue*num+1];
		int flag=0;
		for(int i=1;i<=+MaxValue;i++) {
			probabilities[flag][i]=1;
		}
		for(int k=2;k<=num;k++) {
			for(int i=0;i<k;i++) {
				//probabilities 
			}
		}
	}	
	
}
