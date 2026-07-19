import java.util.*;
class Check_for_vowels_or_consonant 
{
 public static void main(String args[])
{
 char c;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your num:");
  c = sc.next().charAt(0);
if ((c>='a' && c<='z') || (c>='A' && c<='Z'))
    if (c=='a' || c=='e' || c=='i' ||c=='o'||c=='u')
	System.out.println("vowels ");
    else
	System.out.println("consonant ");
else
   System.out.println(" not alphabet ");

}

}