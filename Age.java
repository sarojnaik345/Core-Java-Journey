import java.util.*;
class Age
{
 public static void main(String args[])
 {
	int birth_year, current_year,age;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the birth year:");
	birth_year = sc.nextInt();
	System.out.println("enter the current year:");
	current_year = sc.nextInt();
	 age = current_year - birth_year;
	
	System.out.println("age is :"+age);

 }

}
