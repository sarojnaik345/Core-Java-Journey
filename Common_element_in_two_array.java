import java.util.Scanner;

public class Common_element_in_two_array {
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

        System.out.println("the elemtnt of array1 is :");
        for(int i =0;i<arr1_size;i++)
        {
           System.out.print(arr1[i]+" ");
        }
        System.out.println();
        // SECOND ARRAY SECTION
        System.out.println("enter the size of  the array2:");
        int arr2_size= sc.nextInt();
        int arr2[] = new int[arr2_size];
        System.out.println("enter  the elemnt for the 2ND  array:");
        for(int i =0;i<arr2_size;i++)
        {
            arr2[i]= sc.nextInt();
        }

         System.out.println("the elemtnt of array2 is :");
        for(int i =0;i<arr2_size;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        //OUTPUT SECTION
        // if(arr1_size>arr2_size)
        // {
        //     System.out.println("THe common elent are :");
        //     for(int i= 0;i<arr1_size;i++)
        //     {
        //         boolean reached =false;
        //          for(int j=0;j<arr2_size;j++)
        //         {
                
        //             if(arr1[i]==arr2[j])
        //             {
        //                 System.out.printf("%5d  ",arr1[i]);
        //             }
        //             if(j==arr2_size-1)
        //                 reached=true;
        //         }
        //         if(reached)
        //             return;
        //     }
        // }
        // else{
        //     System.out.println("THe common elent are :");
        // for(int i= 0;i<arr1_size;i++)
        // {
           
        //     for(int j=0;j<arr2_size;j++)
        //     {
                 
                
        //         if(arr1[i]==arr2[j])
        //         {
        //             System.out.printf("%5d  ",arr1[i]);
        //         }
        //         if (j ==arr2_size-1)
        //              return ;
        //     }
        // }
        // }
        System.out.println("the commnn element are:");
        for(int i =0;i<arr1_size;i++)
        {
            for(int j=0;j<arr2_size;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}
