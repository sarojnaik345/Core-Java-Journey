import java.util.Scanner;

public class Palindrome_of_1d_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of  the array1:");
        int arr1_size= sc.nextInt();
     
        int arr1[] = new int[arr1_size];
         System.out.println("enter  the elemnt for  the FIRST array:");
        for(int i =0;i<arr1_size;i++)
        {
            arr1[i]= sc.nextInt();
        }

        System.out.println("the elemtnt of array1 is :");
        for(int i =0;i<arr1_size;i++)
        {
           System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int rev_arr[] = new int[arr1_size];
        int k =0;
        for(int i =arr1_size-1 ;i>=0;i--)
        {
            rev_arr[k]= arr1[i];
            k++;
        }
        boolean flag = false;
        for(int i =0;i<arr1_size;i++)
        {
            if(arr1[i]!=rev_arr[i])
                    flag= true;
        }
        if(flag)
            System.out.println("array not is palindrom");
        else
            System.out.println("array is   palindrom");

}
}
