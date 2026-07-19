import java.util.*;
class Celcius_to_fahrenheit
{
 public static void main(String args[])
 {
	float celsius,fahrenheit ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter tempereature in Celsius:");
	celsius = sc.nextFloat();
	fahrenheit = ((celsius * 1.8f) + 32);
	System.out.println("tempereature in Fahrenheit:"+fahrenheit);
	
 }
}
