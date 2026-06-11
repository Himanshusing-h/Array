import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        //Print the Maximum element in the array
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
