import java.util.*;
// import java.lang.*;
public class Armstrong_Number_math_library {
    public static void main(String arg[])
    {
        int num,sum=0,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nuber to check armstrong:");
        num = sc.nextInt();
        int temp = num;
        while(temp>0)
        {
            temp/=10;
            count++;
        }
        temp=num;
       while(temp>0){
        int rem= temp%10;
        sum+=(int) Math.pow(rem,count);
        temp/=10;
       }
        if(num==sum)
            System.out.println(num+" is Arsmtrong number ");
        else
            System.out.println(num+" is  not Arsmtrong number ");
        sc.close();
    }
}
