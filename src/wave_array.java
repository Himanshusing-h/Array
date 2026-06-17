import java.util.Scanner;

public class wave_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int i = 0;
        int j = 1;
        while (j < arr.length) {


            swapp(arr, i, j);
            i += 2;
            j += 2;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

    //we are taking two element ,first should be less and second should be big if its like that then ok if not do it
    static void swapp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}


