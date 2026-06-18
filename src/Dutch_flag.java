import java.util.Scanner;
//important question
//explaination in notes
public class Dutch_flag {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Enter length of array");
       int n = s.nextInt();

       int[] arr = new int[n];

       System.out.println("Enter array elements");
       for (int i = 0; i < n; i++) {
           arr[i] = s.nextInt();
       }

                int low=0;
                int mid=0;
                int hi=arr.length-1;
                while(mid<=hi){
                    if(arr[mid]==0){
                        int temp=arr[low];
                        arr[low]=arr[mid];
                        arr[mid]=temp;
                        low++;
                        mid++;
                    }
                    else if(arr[mid]==1){
                        mid++;
                    }
                    else{
                        int temp=arr[hi];
                        arr[hi]=arr[mid];
                        arr[mid]=temp;
                        hi--;
                    }
                }
                for (int element :arr)
                {
                    System.out.print(element+" ");
                }
            }
        }


