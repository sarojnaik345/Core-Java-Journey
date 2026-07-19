import java.util.Scanner;

public class Strong_Number {
    public static void main(String args[])
    {
        int num,strong= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber to check Strong number:");
        num = sc.nextInt();
        int temp=num;
        while(temp>0){
            int fact=1;
            int rem=temp%10;
            for(int i =1;i<=rem;i++)
            {
                fact*=i;
            }
            strong+=fact;
            temp/=10;
        }
        sc.close();
        if(num==strong)
            System.out.println(num+" is a strong number");
        else
            System.out.println(num+" is not a strong number");
    }
}
