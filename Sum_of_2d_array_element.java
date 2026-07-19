import java.util.*;
public class Sum_of_2d_array_element {
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enyetr the row size of of array :");
        int row = sc.nextInt();
        System.out.println("enyetr the col size of of array :");
        int col = sc.nextInt();
        int arr_2d[][]= new int[row][col];
        int sum = 0;
        System.out.println("enter the elemnt of the 2d array;");
        for (int i =0;i<row;i++)
        {
            for (int j = 0; j<col;j++)
            {
                arr_2d[i][j]  = sc.nextInt();
                sum+=arr_2d[i][j];
            }
        }
        System.out.println("Sum of the 2D array elemnt is:");
         for (int i =0;i<row;i++)
        {
            for (int j = 0; j<col;j++)
            {
                if(i==row-1 && j== col-1)
                System.out.print(arr_2d[i][j]);
            else
                System.out.print(arr_2d[i][j]+" + ");
            }
            
        }
        System.out.print(" = "+sum);
        sc.close();
    }
}
