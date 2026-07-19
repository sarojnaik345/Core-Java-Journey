//wap to print the sum of 1D array and 2D array using single inheritance
import java.util.*;
class Array{
    Scanner sc = new Scanner(System.in);
    void one_D_array(int arr_size)
    {
        int arr[] = new int[arr_size];
        System.out.println("enter the element of 1D array:");
        for(int i = 0;i<arr_size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int a:arr)
        {
            sum+=a;
        }
        System.out.println("the sum of the 1D array is:"+sum);
    }
    void two_D_array(int row,int col)
    {
         int arr[][] = new int[row][col];
        System.out.println("enter the element of 2D array:");
        for(int i = 0;i<row;i++)
        {
           for(int j = 0;j<col;j++)
           {
             arr[i][j]= sc.nextInt();
           }
        }
        int sum =0;
        for(int[] r:arr)
        {
           for(int a : r)
           {
             sum+=a;
           }
        }
        System.out.println("the sum of the 2D array is:"+sum);
    }
}
public class Q2 extends Array {
    public static void main(String args[])
    {
        Q2 ob = new Q2();
        // ob.one_D_array(5);
        ob.two_D_array(2,2);
    }
}
