import java.util.*;
class Sum_of_Digit_of_3_digit_number
{
 public static void main(String args[])
 {
   int number,first_digit,second_digit,last_digit,sum;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the number:");
   number = obj.nextInt();
   last_digit = number % 10; 
   number =number /10;
   second_digit= number %10;
   number =number /10;
	first_digit = number%10;
   sum = first_digit + second_digit + last_digit;
   System.out.println("sum of the  digit of "+number+"is :"+sum);
 }
}