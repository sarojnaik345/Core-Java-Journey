import java.util.*;
class Divisible_by_5_and_11
{
 public static void main(String args[])
{
 int num;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your num:");
  num = sc.nextInt();
    if (num%5==0 && num %11 == 0)
	System.out.println(num+"divisible by 5 and 11 ");
    else
	System.out.println(num+" is not divisible by 5 and 11 ");
}

}