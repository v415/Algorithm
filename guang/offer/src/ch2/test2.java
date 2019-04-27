package ch2;


public class test2 {
	   public void reOrderArray(int [] array) {
	        for(int i=0;i<array.length-1;i++){
	            if(array[i]%2==0 && array[i+1]%2==1){
	                int temp=array[i];
	                for(int j=i;j<array.length-1;j++){
	                    array[j]=array[j+1];
	                }
	                array[array.length-1]=temp;
	            }
	        }
	        for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+ " ,");
			}
	    }
	   public static void main(String[] args) {
		   test2 t=new test2();
		   int [] arr= {1,2,3,4,5,6,7};
		   t.reOrderArray(arr);
	}
}