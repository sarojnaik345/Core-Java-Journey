import java.util.*;
class Simple_Interest
{
 public static void main(String args[])
 {
	float simple_interest, principle, time,inetrest_rate;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the principle amount:");
	principle= sc.nextFloat();
	System.out.println(" Enter the time duation:");
	time = sc.nextFloat();
	System.out.println(" Enter the inetrest_rate:");
	inetrest_rate = sc.nextFloat();

	simple_interest = principle*time* inetrest_rate;
	System.out.println("simeple interest is :"+simple_interest);
	
 }
}
