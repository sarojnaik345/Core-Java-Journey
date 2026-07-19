import java.util.Scanner;

public class Gross_salary_of_employee {
    public static void main(String args[])
    {
        double basic_salary,hra,da,gross_salary_of_employee;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your basic salary :");
        basic_salary = sc.nextDouble();
        if(basic_salary<=10000)
        {
            da=basic_salary * 0.80;
            hra = basic_salary * 0.20;
            gross_salary_of_employee = basic_salary + da + hra;
            System.out.print("Gross salary of employee is :"+gross_salary_of_employee);
        }
        else if(basic_salary<=20000)
        {
            da=basic_salary * 0.90;
            hra = basic_salary * 0.25;
            gross_salary_of_employee = basic_salary + da + hra;
            System.out.print("Gross salary of employee is :"+gross_salary_of_employee);
        }
        else if(basic_salary>=20000)
        {
            da=basic_salary * 0.95;
            hra = basic_salary * 0.30;
            gross_salary_of_employee = basic_salary + da + hra;
            System.out.print("Gross salary of employee is :"+gross_salary_of_employee);
        }
        else
            System.out.println("invalid!!");

        sc.close();
    }
}
