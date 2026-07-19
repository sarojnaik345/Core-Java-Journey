import java.util.*;
class Eligibility_for_Scholarship
{
 public static void main(String args[])
{
 int math,arg,science;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your math:");
  math = sc.nextInt();
   System.out.println("enter your arg:");
  arg = sc.nextInt();
 System.out.println("enter your science:");
  science = sc.nextInt();
 if (math>=90)
	System.out.println("eligibel  for schloraship ");
 else if(arg >= 60)
	System.out.println("eligibel  for schloraship");
 else if(science  >= 75 && math >=75)
	System.out.println("eligibel  for schloraship");
else 
	System.out.println("not eligibel  for schloraship");
}

}