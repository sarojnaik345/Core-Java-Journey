import java.util.*;
class Greater_then_90_add_2_else_add_5
{
 public static void main(String args[])
{
 int num1;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your num1:");
  num1 = sc.nextInt();
  
 if (num1>90){
	num1+=2;
	System.out.println("greatest no is "+num1);
}
 else{
	num1+=5;
	System.out.println("greatest no is "+num1);
}
}

}