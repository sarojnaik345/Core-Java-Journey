import java.util.Scanner;

class Factorial{
    int num;
    Scanner sc = new Scanner(System.in);
    int input()
    {
        System.out.println("enter the number below 20:");
        num = sc.nextInt();
        if(num >20 || num<0)
            System.out.println("we won't proceed.");
        return factorial(num);
        
    }
    int factorial(int x)
    {
        if(x ==1)
            return 1;
        int fact = 1;
         return fact*=factorial(x-1);

    }
}
public class Factorial_using_6_rules_of_java {
    public static void main(String args[])
    {
        Factorial ob = new Factorial();
        System.out.println(ob.input());
    }
}
