import java.util.Scanner;

public class Sum_of_primary_diagonal {
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
        System.out.println("the 2d array is:");
        for (int i =0;i<row;i++)
        {
            
            for (int j = 0; j<col;j++)
            {
                
                System.out.print(arr_2d[i][j]+" ");
            }
            System.out.println();
        }3

        System.out.println("the 2d boundary array is:");
        for (int i =0;i<row;i++)
        {
            for (int j = 0; j<col;j++)
            {
                if(i==j)
                System.out.printf("%3d",arr_2d[i][j]);
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
