import java.util.*;
class Gross_salary
{
 public static void main(String args[])
 {
	float tds,gross_salary,epf,net_salary;
	Scanner sc = new Scanner(System.in);
System.out.println(" enter yoru net_salary  per month:");
	net_salary = sc.nextFloat();
System.out.println(" enter yoru TDS cut per month:");
	tds = sc.nextFloat();
System.out.println(" enter yoru EPF per month:");
	epf = sc.nextFloat();
	
	gross_salary = net_salary+ tds+epf;
System.out.println("gross salary is "+gross_salary);
sc.close();

 }

}
