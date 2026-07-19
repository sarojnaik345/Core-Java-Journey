import java.util.*;
class Check_for_Upper_or_Lower
{
 public static void main(String args[])
{
 char c;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your charecter:");
  c = sc.next().charAt(0);
    if (c>='a' && c<='z')
	System.out.println("lower ");
    else if  (c>='A' && c<='Z')
	System.out.println(" upper ");
else
	System.out.println(" invalid! ");
}

}