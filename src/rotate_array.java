import java.util.Scanner;
public class rotate_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Taking input length of Array;
        System.out.println("enter length of array");
        int a = s.nextInt();
       //Creating an array;
        int[] arr = new int[a];
        //Taking d input
        System.out.println("Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer");
        int d = s.nextInt();

        int n = arr.length;
        //Taking array input
        System.out.println("enter array");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
//making sure d dont go out of bond wrt array
        d = d % n;
        //calling function
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        //Printing array
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    //Function to reverse a array
//Two pointer and swapping
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;//updation

        }
    }
}

