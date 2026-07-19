import java.util.*;
public class Smallest_element_in_2D_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enyetr the row size of of array :");
        int row = sc.nextInt();
        System.out.println("enyetr the col size of of array :");
        int col = sc.nextInt();
        int arr_2d[][]= new int[row][col];
        
        System.out.println("enter the elemnt of the 2d array;");
        for (int i =0;i<row;i++)
        {
            for (int j = 0; j<col;j++)
            {
                arr_2d[i][j]  = sc.nextInt();
               

            }
        }
        int smallest = arr_2d[0][0];
        System.out.println("Sum of the 2D array elemnt is:");
         for (int i =0;i<row;i++)
        {
            for (int j = 0; j<col;j++)
            {
                System.out.printf("%5d",arr_2d[i][j]);
                 if(smallest > arr_2d[i][j])
                    smallest= arr_2d[i][j];
            }
            System.out.println();
            
        }
        System.out.print("Samllest of the elemnt in 2d array is : "+smallest);
        sc.close();
    }
}
