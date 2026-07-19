import java.util.*;
class Leap_Year
{
 public static void main(String args[])
{
 int year;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your num1:");
  year = sc.nextInt();
  
 if ((year%4 ==0 && year %100!= 0 )|| (year%400 ==0))
	System.out.println(year+" a Leap year");
 else
	System.out.println(year+"not  a Leap year");
}

}