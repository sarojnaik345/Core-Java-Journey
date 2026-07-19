import java.util.Scanner;

public class PrimeNUmber {
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber to check prime number:");
        num = sc.nextInt();
        boolean flag= false;
        for(int i =2;i<=(num/2);i++)
        {
            if (num%i==0)
                flag = true;
        }
        sc.close();
        if (flag)
            System.out.print(num+" is not a prime number");
        else
            System.out.print(num+" is a prime number");
    }
}
   