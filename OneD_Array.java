import java.util.Scanner;

public class OneD_Array {
    public static void main(String args[])
    {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the "+size+" element of the array:");
        for(int i= 0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i= 0;i<size;i++)
        {
        //    System.out.println("elemrnt of index position arr["+i+"] is :"+arr[i]);
        System.out.print(" "+arr[i]);
        }
        sc.close();
    }
}
