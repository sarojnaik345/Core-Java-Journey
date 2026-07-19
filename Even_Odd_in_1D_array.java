import java.util.Scanner;

public class Even_Odd_in_1D_array {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of  the Arry");
        int size = sc.nextInt();
        int arr[]= new int[size];
        // int even_array[] = new int[0];
        System.out.println("entr the elemnet of the array:");
        int even_count=0;
        int odd_count =0;
        for(int i =0;i<size;i++)
        {
            arr[i]= sc.nextInt();
            if(arr[i]%2==0)
                even_count++;
            else
                odd_count++;

        }
        int even_array[]= new int[even_count];
        int odd_array[] = new int[odd_count];
        int j =0;
        int k = 0;
        for(int i =0;i<size;i++)
        {
            if (arr[i]%2==0){
                even_array[j]=arr[i];
                j++;
            }
            else
            {
                odd_array[k]=arr[i];
                k++;
            }
        }
        System.out.println();
        System.out.println("even elent  of the array in even arra form");
       for(int i =0;i<even_count;i++)
       {
        System.out.printf("%5d",even_array[i]);
       }
       System.out.println();

       System.out.println("odd eement  of the array in odd arra form");

       for(int i =0;i<odd_count;i++)
       {
        System.out.printf("%5d",odd_array[i]);
       }
        sc.close();
    }

    
}
