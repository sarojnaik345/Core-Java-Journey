import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range  to print fibonacci series:");
        num = sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2+" ");
        for(int i =1;i<=num;i++)
        {
            int num3= num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
        sc.close();

    }
}
