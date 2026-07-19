import java.util.*;
public class Sort_Array_in_Decending_Order {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of  the array1:");
        int arr1_size= sc.nextInt();
        //FIRST ARRAY SECTION
        int arr1[] = new int[arr1_size];
         System.out.println("enter  the elemnt for  the FIRST array:");
        for(int i =0;i<arr1_size;i++)
        {
            arr1[i]= sc.nextInt();
        }

         System.out.println(" sorting process :");
        for(int i = 0;i<arr1_size;i++)
        {
            for(int j=0;j<arr1_size;j++)
            {
                // THIS COMMENTED IS FOR ASECNDING ORDER
                // if(arr1[i]<arr1[j])
                // {
                //     int temp = arr1[i];
                //     arr1[i]=arr1[j];
                //     arr1[j]=temp;
                // }

                // DECENDING OF ARRAY
                if(arr1[i]>arr1[j])
                {
                    int temp= arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                   
                }
               
            }
            
        }
        System.out.println("the sorted array is :");
        for(int i=0;i<arr1_size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
