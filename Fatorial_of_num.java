import java.util.*;
public class Fatorial_of_num {
    public static void main(String args[])
    {
        int fact = 1,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        num= sc.nextInt();
        int fc=num;
        while(num>=1)
        {
            fact*=num;
            num--;
        }
        System.out.println("factrorial of "+fc+"! is :"+fact);
        sc.close();
    }
}
