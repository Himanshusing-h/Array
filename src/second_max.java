//Print the second Maximum element in the array

import java.util.Scanner;

public class second_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        //Taking array as input
        System.out.println("enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        //Initializing max and second max
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        //finding maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //finding second maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }
        //printing second maximum
        System.out.println(smax);


    }
}
