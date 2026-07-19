// WAP  to check Palindrome, Strong number, and print Factorial of a number using single inheritance
class Checker_palindrome_strong{
   void palindrome(int num)
    {
         int temp= num,rem,sum=0;
        while(temp>0)
        {
            rem= temp%10;
            sum= (sum*10)+rem;
            temp/=10;
        }
        if(sum == num)
            System.out.println(num+" is a palindrome number");
        else
            System.out.println(num+" is not a  palindrome number");
       
    }
     int factorial(int num)
     {
        int fact = 1;
        if(num==0 || num==1)
            return 1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
     }
   void strong(int num)
   {
     int temp= num,rem;
        int strong=0;
        while(temp>0)
        {
            rem= temp%10;
            strong+=factorial(rem);
            // sum= (sum*10)+rem;
            temp/=10;
        }
        if(strong == num)
            System.out.println(num+" is a strong number");
        else
            System.out.println(num+"not a strong number");
   }
}
public class Q1 extends Checker_palindrome_strong{
    public static void main(String args[])
    {
        Q1 ob = new Q1();
        ob.palindrome(121);
        ob.strong(145);
         int fact = ob.factorial(5);
         System.out.println(fact);
    }
}
