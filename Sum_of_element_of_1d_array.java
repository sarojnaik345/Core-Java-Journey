import java.util.Scanner;

public class Sum_of_element_of_1d_array {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of  the Arry");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("entr the elemnet of the array:");
        int sum= 0;
        for(int i =0;i<size;i++)
        {
            arr[i]= sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("the sum of  one D ayyar is :");
        for(int i =0;i<size;i++)
        {
            if(i==size-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+" + ");
        }
        System.out.println(" = "+sum);
        sc.close();
    }

    
}
