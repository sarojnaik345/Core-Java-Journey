import java.util.Scanner;

public class Palindrome_number {
    public static void main(String args[])
    {
        int num,palindrome=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber to check plindrome number:");
        num = sc.nextInt();
        int temp = num;
        while(temp>0)
        {
            int rem = temp%10;
            palindrome= palindrome*10+rem;
            temp/=10;
        }
        sc.close();
        if(num==palindrome)
            System.out.println(num+" Palindrome Number.");
        else
            System.out.println(num+" is  not a Palindrome Nunmber");
    }
}
