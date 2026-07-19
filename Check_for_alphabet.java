import java.util.*;
class Check_for_alphabet
{
 public static void main(String args[])
{
 char c;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your num:");
  c = sc.next().charAt(0);
    if ((c>='a' && c<='z') || (c>='A' && c<='Z') )
	System.out.println("alhabet ");
    else
	System.out.println("not alphabet ");
}

}