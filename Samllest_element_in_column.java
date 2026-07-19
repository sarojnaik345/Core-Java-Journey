import java.util.Scanner;

public class Samllest_element_in_column {
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
        System.out.println();

        System.out.println(" the 2d array is :");
        for (int i =0;i<row;i++)
        {    
            for (int j = 0; j<col;j++)
            {
               System.out.printf("%5d",arr_2d[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Smallest of  the 2d array is :");
        
        for (int j =0;j<col;j++)
        {
            int smallest=arr_2d[j][0];
            for (int i = 0; i<row;i++)
            {
                if(arr_2d[i][j] < smallest)
                    smallest= arr_2d[i][j];
                //  System.out.printf("%5d",arr_2d[i][j]);
            }
             System.out.print("smallest of the elemnt in 2d array column is : "+smallest);
            System.out.println();
        }
        // System.out.println();

        // System.out.println("Sum column of the 2D array elemnt is:");
        //  for (int j =0;j<col;j++)
        // {
        //     int sum_col = 0;
        //     for (int i = 0; i<row;i++)
        //     {
        //         sum_col+=arr_2d[i][j];
        //     }
        //     System.out.println("the sum of col"+j+"is :"+sum_col);
            
        // }
        
        sc.close();
    }
}
