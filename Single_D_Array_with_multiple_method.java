import java.util.Scanner;

public class Single_D_Array_with_multiple_method {
    Scanner  sc = new Scanner(System.in);
    
    void intput_array()
    {
        System.out.println("enter the size of the array:");
        int arr_size = sc.nextInt();
         int array[]  = new int[arr_size];
         System.out.println(" enter the arry element :");
         for(int i = 0;i<arr_size;i++)
         {
            array[i]=sc.nextInt();
         }
          reverse_Array(array, arr_size);
    }
    void reverse_Array( int[] arr, int arr_size)
    {
        System.out.println("the reverse of the array is :");
            for(int i =arr_size-1;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
    }
    public static void main(String args[])
    {
        Single_D_Array_with_multiple_method ob = new Single_D_Array_with_multiple_method();
        ob.intput_array();
    }
}
