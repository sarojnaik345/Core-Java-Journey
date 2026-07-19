import java.util.*;
class Arithmatic
{
 public static void main(String arg[])
  {
	int num1 , num2 ;
	Scanner sc = new Scanner(System.in);
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	System.out.println("Addition of the two number "+num1+" and "+num2+"is  :"+(num1+num2));
	System.out.println("Substraction of the two number "+num1+" and "+num2+"is  :"+(num1-num2));
	System.out.println("Multiplication of the two number "+num1+" and "+num2+"is  :"+(num1*num2));
	System.out.println("Division of the two number "+num1+" and "+num2+"is  :"+(num1/num2));
   }
}