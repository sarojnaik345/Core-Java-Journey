import java.util.Scanner;

class Input_class{
     Input_class()
    {
        int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    num = sc.nextInt();
    Check_even_Odd ob = new Check_even_Odd(num);
    // Check_even_Odd(num);
    sc.close();
    }
}
class Check_even_Odd{
    Check_even_Odd( int x)
    {
        if(x%2==0)
           System.out.println(x+" is even.");
        else
            System.out.println(x+" is odd.");
    }
}

public class Multiple_class_check_even_odd {
    public static void main(String args[])
    {
    Input_class ob = new Input_class();
    }
}
