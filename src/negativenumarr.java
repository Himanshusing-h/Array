import java.util.Scanner;
public class negativenumarr {
    public static void main(String[] args) {
        //Given an Array, print negative elements only
    Scanner s=new Scanner(System.in);
    int [] arr=new int[5];
        System.out.println("enter array");
        //taking input
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();

        }
        //checking
        for (int i=0;i<arr.length;i++)
        {
            //condition
            if(arr[i]<0)
                System.out.println(arr[i]);
        }


    }
}
