import java.util.Scanner;

public class Check_2_matrice_of_2d_are_equal_or_not {
     public static void main(String arg[])
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
        }
        //the 2d second array
        System.out.println("enyetr the row size of of array :");
        int row1 = sc.nextInt();
        System.out.println("enyetr the col size of of array :");
        int col1 = sc.nextInt();
        int arr_2d1[][]= new int[row1][col1];
        
        System.out.println("enter the elemnt of the 2d array;");
        for (int i =0;i<row1;i++)
        {
            
            for (int j = 0; j<col1;j++)
            {
                arr_2d1[i][j]  = sc.nextInt();
                

            }
        }
        System.out.println("the 2d array is:");
        for (int i =0;i<row1;i++)
        {
            
            for (int j = 0; j<col1;j++)
            {
                System.out.print(arr_2d1[i][j]+" ");
            }
            System.out.println();
        }
        boolean same=true;
        if(row!=row1 || col != col1)
            same=false;
         else
         {
            for(int i=0;i<col;i++)
            {
                for(int j=0;j<row;j++)
                {
                     if(arr_2d[i][j]!=arr_2d1[i][j])
                       {
                        same = false;
                        break;
                       }
                }
                if(!same)
                    break;
            }
         }

         if(same)
            System.out.println("matrice same");
        else
            System.out.println("matrice not Same");
        sc.close();
     }
}
