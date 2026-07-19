import java.util.*;
class Last_Digit_of_3_digit_number
{
 public static void main(String args[])
 {
   int number,last_digit;
   Scanner obj = new Scanner(System.in);
	System.out.print(" Enter the number:");
   number = obj.nextInt();
   last_digit = number % 10; 
   System.out.println("Last digit of "+number+"is :"+last_digit);
 }
}
