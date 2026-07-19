import java.util.*;
public class Sort_numeric_and_string_arrays {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        char str_arr[] = new char[size];
        int int_arr[] = new int[size];
        System.out.println("enter the char element");
        for(int i = 0;i<size;i++)
        {
            str_arr[i] = sc.next().charAt(0);
        }
         System.out.println("enter the int_array element");
        for(int i = 0;i<size;i++)
        {
            int_arr[i] = sc.nextInt();
        }
        System.out.println("her the sorted arry");
        for(int i = 0;i<size;i++)
        {
            System.out.print(int_arr[i]+" ");
        }
        for(int i = 0;i<size;i++)
        {
            System.out.print(str_arr[i]+" ");
        }
        sc.close();

    }
}
