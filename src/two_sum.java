import java.util.Scanner;
//Two sum
public class two_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr=new int[5];
        //Taking input
        System.out.println("enter array");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        //Taking input of the sum
        System.out.println("enter sum to be obtained");
        int sum=s.nextInt();
        //finding numbers whose sum is equal to sum
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]+arr[j]==sum){
                    System.out.println("number obtained");
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
