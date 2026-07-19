import java.util.*;
class NCC_Eligibility_Test_Using_Nested_IF
{
 public static void main(String args[])
{
 int height,weight;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your height:");
  height = sc.nextInt();
   System.out.println("enter your weight:");
  weight = sc.nextInt();
 if (height >=160 )
 	if(weight>=65)
	      System.out.println("Eligible for NCC");
	else
	      System.out.println("not Eligible due to weight for NCC");
	
 else
	System.out.println("Not Eligible due to height for NCC");
}
}