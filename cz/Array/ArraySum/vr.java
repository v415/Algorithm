import java.util.Scanner;

public class vr {

    public static int maxSubArraySum(){
        Scanner scanner =new Scanner(System.in);
        String[] a=scanner.nextLine().split(",");
        int sum=0;
        int[] n =new int[a.length];
        for (int i=0;i<a.length;i++){
            n[i]=Integer.parseInt(a[i]);

            if (n[i]<0){
                continue;
            }else {
                sum=sum+n[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(maxSubArraySum());
    }
}
