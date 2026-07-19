import java.util.Scanner;

public class largest_element_in_row {
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
        System.out.println("the 2d array is ;");
        for (int i =0;i<row;i++)
        {
            for (int j = 0; j<col;j++)
            {
                System.out.print(arr_2d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("largest element in of the 2D array elemnt is:");
         for (int i =0;i<row;i++)
        {
            int largest = arr_2d[i][0];
            for (int j = 0; j<col;j++)
            {
                if(arr_2d[i][j] > largest)
                    largest= arr_2d[i][j];
                // System.out.printf("%5d",arr_2d[i][j]);
            }
            System.out.print("latrgest of the elemnt in 2d array is : "+largest);
            System.out.println();
            
        }
        
        sc.close();
    }
}
