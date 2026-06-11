import java.util.Scanner;

//Search in Array
public class searchele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int a = 0;
        //Taking innput
        System.out.println("enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        //Taking input number to be find
        System.out.println("enter number to search");
        int found = s.nextInt();
        int flag = 0;

//Finding number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) {
                flag++;
                a = i;
                break;

            }
        }
        //Printing
        if (flag == 1) {
            System.out.println("number found");
            System.out.println("index" + " " + a);
        } else
            System.out.println("sorry");

    }
}
