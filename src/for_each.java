import java.util.Scanner;

public class for_each {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        //Taking input array
        System.out.println("enter array");
        for (int i=0;i<arr.length;i++)
        {
           arr[i]=s.nextInt();
        }

//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        //both loop will work same
        //for each cant be used when operations to be performed using index as index is not recored in for each loop

        for (int element:arr)
        {
            System.out.println(element);
        }
    }
}
