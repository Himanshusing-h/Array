//Multiply odd indexed elements by 2 and add 10 to even indexed elements

import java.util.Scanner;

public class multiplyandaddtoindex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        //Taking array input
        System.out.println("enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        //Applying operation
        for (int i = 0; i < arr.length; i++) {
            //if even add 10
            if (arr[i] % 2 == 0)
                arr[i] += 10;
                //if odd multiply by 2
            else
                arr[i] *= 2;

        }
        //Printing array
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
