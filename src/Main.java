
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int c;
        int first = 0;
        int last=arr.length-1;
        System.out.println(last);
//       while (first!=last)
//       {
//           c=arr[first];
//           arr[first]=arr[last];
//           arr[last]=c;
//           first++;
//           last--;
//       }
        while (first<last)
        {
            c=arr[first];
            arr[first]=arr[last];
            arr[last]=c;
            first++;
            last--;
        }
       for (int ele:arr){
           System.out.println(ele);
       }


    }
}

