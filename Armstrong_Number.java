import java.util.*;

public class Armstrong_Number {
    public static void main(String arg[])
    {
        int num,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nuber to check armstrong:");
        num = sc.nextInt();
        int temp = num;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp = num;
        int armstrong=0;
        while(temp>0)
        {
            int rem = temp%10;
            int product=1;
            for(int i =1;i<=count;i++)
           {
            product*=rem;
           }   
          armstrong+=product;
          temp/=10;
        }
        if(num==armstrong)
            System.out.println(num+" is Arsmtrong number ");
        else
            System.out.println(num+" is  not Arsmtrong number ");
        sc.close();
    }
}
