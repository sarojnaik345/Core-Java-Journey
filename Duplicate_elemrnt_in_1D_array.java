import java.util.Scanner;

public class Duplicate_elemrnt_in_1D_array {
    public static void main(String args[])
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
       System.out.println();
        int duplicate_arra[] = new int[size];
        int k=0;
        for(int i =0;i<size;i++)
        {
            int count=0;
            
            for (int j =0;j<size;j++){
                if (arr[i]==arr[j])
                    count++;
            }
            boolean alreadysaved = false;
            if(count>1){
                
                for(int m=0;m<k;m++)
                {
                    if(arr[i]==duplicate_arra[m])
                        alreadysaved = true;
                }
                if(!alreadysaved){
                duplicate_arra[k]=arr[i];
                k++;
            }
    
            }
            
                
                
        }
        System.out.println("the duplicate elemnt are :");
        for(int i =0;i<k;i++)
        {
            System.out.printf("%3d",duplicate_arra[i]);
        }
        sc.close();
    }
}
