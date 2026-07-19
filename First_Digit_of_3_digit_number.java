import java.util.*;
class First_Digit_of_3_digit_number
{
 public static void main(String args[])
 {
   int number,first_digit,second_digit,last_digit;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the number:");
   number = obj.nextInt();
   last_digit = number % 10; 
   number =number /10;
   second_digit= number %10;
   number =number /10;
	first_digit = number%10;
   System.out.println("Last digit of "+number+"is :"+first_digit);
 }
}