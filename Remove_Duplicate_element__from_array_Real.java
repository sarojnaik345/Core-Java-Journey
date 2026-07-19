import java.util.Scanner;

public class Remove_Duplicate_element__from_array_Real {
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of  the array:");
        int arr_size= sc.nextInt();
        int arr[] = new int[arr_size];
         System.out.println("enter  the elemnt for the array:");
        for(int i =0;i<arr_size;i++)
        {
            arr[i]= sc.nextInt();
        }
        int removed_duplicate_array[] = new int[arr_size];
        int k =0;
        for(int i =0;i<arr_size;i++)
        {
           int count =0;
           for (int j = 0;j<arr_size;j++)
           {
            if(arr[i]==arr[j])
                count++;
           }
           if(count>1){
            boolean alreadyhave = false;
            for(int l =0;l<=k;l++){
                if(arr[i]==removed_duplicate_array[l])
                    alreadyhave= true;
            }
            if(!alreadyhave || count==1)
             {
                removed_duplicate_array[k] = arr[i];
             k++;
             }
           }
           
        }
        System.out.println("the removed_duplicate_array are :");
        for(int i =0;i<k;i++){
            System.out.println(removed_duplicate_array[i]+" ");
        }
        
    }
}
