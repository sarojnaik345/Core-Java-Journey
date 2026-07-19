import java.util.Scanner;

class Factorial
{
    int num;
    int  input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  to find its factorial:");
        num = sc.nextInt();
        return num;
        
    }
    void factorial()
    {
        int fact =1;
        int num =input(); 
         int temp = num;
        while (num>=1) {
            fact*=num;
            num--;
        }
        System.out.print("teh factorial of the "+temp+" is :"+fact);
    }
}
public class Factorial_using_6_rules_of_java1 {
    public static void main(String args[])
    {
        Factorial ob = new Factorial();
        ob.factorial();
        
    }
}
