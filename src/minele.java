import java.util.Scanner;

public class minele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //creating array
        int[] arr = new int[5];
        System.out.println("enter array");

//Taking array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int min = Integer.MAX_VALUE;
        //Calculating minimum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //Printing minimum
        System.out.println(min);
    }
}
