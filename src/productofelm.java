import java.util.Scanner;
public class productofelm {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int []arr=new int[5];
     int product=1;

        System.out.println("enter array");
        //taking input
     for (int i=0;i<arr.length;i++)
     {
         arr[i]=s.nextInt();

     }
     //calculating product
     for (int i=0;i<arr.length;i++)
     {
         product *=arr[i];
     }
     //printing product
        System.out.println(product);
    }
}
