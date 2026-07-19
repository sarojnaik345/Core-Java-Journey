import java.util.*;
class NCC_Eligibility_Test
{
 public static void main(String args[])
{
 int height,weight;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your height:");
  height = sc.nextInt();
   System.out.println("enter your weight:");
  weight = sc.nextInt();
 if (height >=160 && weight>=65)
	System.out.println("Eligible for NCC");

}

}