import java.util.Scanner;

public class Factor_of_number {
    public static void main(String argss[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        num= sc.nextInt();
        for(int i =2;i<=num;i++)
        {
            if(num%i==0)
                System.out.print(" "+i);
        }
        sc.close();
    }
}
