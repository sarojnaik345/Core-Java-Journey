import java.util.*;
public class Delete_an_element_from_a_given_position {
    public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size:");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        System.out.println("enter the element of  array :");
        for( int i =0;i<arr_size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("the array  is :");
        for( int i =0;i<arr_size;i++)
        {
           System.out.print(arr[i]+" ");
        }

        // System.out.println("enter the  which element to delete:");
        // int element = sc.nextInt();
        System.out.println();
        System.out.println("enter the element  you wanna delete:");
        int element = sc.nextInt();
        int position = -1;
        for(int i =0;i<arr_size;i++)
        {
            if(element == arr[i]){
                position=i;
                break;
            }
        }
        if(position < 0)
            System.out.println("Invalid choice!!");
        else{
            for(int i=position;i<arr_size-1;i++)
            {
                arr[i]=arr[i+1];
            }
        }
        int new_arr[]= new int[arr_size-1];
        for(int i =0;i<arr_size-1;i++)
        {
            new_arr[i]=arr[i];
        }
        System.out.println("after the deletion the array is :");
        for(int i =0;i<arr_size-1;i++)
        {
            System.out.println(arr[i]+" ");
        }
        sc.close();


   }

}
