
public class Exponent {

	public static void main(String[] args) {
		System.out.println(Power(10,2));
	}
   public static double Power(double base,int exponent) {
	   if(exponent==0) {
		   return 1;
	   }
	   if(exponent==1) {
		   return base;
	   }
	   double result=Power(base,exponent>>1);
	   result *=result;
	   if((exponent &0x1)==1) {//???
		   result *=base;
	   }
	   return result;
   }
}
