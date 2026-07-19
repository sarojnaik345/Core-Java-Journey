// package 6 Rules_for_OOPs_Concept;

import java.util.Scanner;
class Arithmatic{
    int a,b;
    void Addition(int x, int y)
    {
        // Scanner sc = new Scanner(System.in);
        int c = x+y;
        System.out.println("addition is :"+c);
    }
}
public class Multiple_class_inside_one_program {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Arithmatic ob= new Arithmatic();
        System.out.println("enter the a:");
        ob.a = sc.nextInt();
        System.out.println("enter the b:");
        ob.b = sc.nextInt();
        ob.Addition(ob.a,ob.b);
        sc.close();
    }
}
