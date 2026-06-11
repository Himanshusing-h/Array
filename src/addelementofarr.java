import java.util.Scanner;
public class addelementofarr {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int sum=0;
      int []arr=new int[5];
        System.out.println("enter array");
        //taking input
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        //adding element of array
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        //printing sum
        System.out.println(sum);
    }
}
