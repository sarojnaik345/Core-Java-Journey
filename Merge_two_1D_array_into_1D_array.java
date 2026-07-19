import java.util.*;
public class Merge_two_1D_array_into_1D_array {
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of  the Arry1");
        int size1 = sc.nextInt();
        System.out.println("enter the size of  the Arry2");
        int size2 = sc.nextInt();
        int arr1[]= new int[size1];
        int arr2[]= new int[size2];
        // int even_array[] = new int[0];
        System.out.println("entr the elemnet of the array1:");
        for(int i =0 ; i<size1;i++)
        {
            arr1[i]= sc.nextInt();
        }
        System.out.println("entr the elemnet of the array2:");
        for(int i =0 ; i<size2;i++)
        {
            arr2[i]= sc.nextInt();
        }
        int merged_array[]= new int[size1+size2];
        for (int i=0;i<size1;i++)
        {
            merged_array[i]=arr1[i];
        }
        for (int i=0;i<size2;i++)
        {
            merged_array[size1+i]=arr2[i];
        }
        System.out.println("the mergesd array is :");
        for(int i =0;i<size1+size2;i++)
        {
            System.out.print(merged_array[i]+" ");
        }
        sc.close();
    }
}
