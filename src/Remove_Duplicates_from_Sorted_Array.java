import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
//important question
        //arr={1,1,2,2,2,3,3}
        //{1,2,3,-,-,-,-}
        //return 3;
        /*
        logic if array is sorted in non decreasing order than n!=n+1 if n==n+1 mean next index is duplicate
        and
        we have to use two pointer with i on zeroth index and j on n+1 th index and compare them
        if number at ith index and jth index is same incrementing j with one if not that means it is greater than i so swap it with i+1th index
          while(j<nums.length){
            if(nums[i]!=nums[j]){ "checking number to be put on nxt index
nums[i+1]=nums[j]; "putting not equal number on next index
                i++;"incrementing i;

                j++;"incrementing j
                 k++;

            }
            else{
                j++;
            }
            return k;


         */
       Scanner s = new Scanner(System.in);

       System.out.println("Enter length of array");
       int n = s.nextInt();

       int[] nums = new int[n];

       System.out.println("Enter array elements");
       for (int i = 0; i < n; i++) {
           nums[i] = s.nextInt();
       }
                int i=0;
                int j=1;
                int k=1;

                while(j<nums.length){
                    if(nums[i]!=nums[j]){
                        nums[i+1]=nums[j];
                        i++;
                        j++;
                        k++;

                    }
                    else{
                        j++;
                    }


                }

        System.out.println(k);
            }
        }





