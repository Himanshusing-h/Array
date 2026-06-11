import java.util.Scanner;

public class two_pointer {


    //Reverse Array
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int[] arr = new int[5];
            System.out.println("enter array");
            //taking array input
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            int i = 0;
            int j = arr.length - 1;
            //applying two pointer

            while (i < j) {
                int temp = arr[i];//swapping
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            //Printing array
            for (int element:arr)
            {
                System.out.print(element+" ");
            }
        }
    }


