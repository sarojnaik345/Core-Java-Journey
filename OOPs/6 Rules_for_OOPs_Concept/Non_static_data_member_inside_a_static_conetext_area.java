// package 6 Rules_for_OOPs_Concept;

import java.util.Scanner;

public class Non_static_data_member_inside_a_static_conetext_area {
    int a,b;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Non_static_data_member_inside_a_static_conetext_area ob = new Non_static_data_member_inside_a_static_conetext_area();
        System.out.println("enter the value for  a:");
        ob.a = sc.nextInt();
        System.out.println("enter the value for  b:");
        ob.b = sc.nextInt();
        int c = ob.a + ob.b;
        System.out.println("Addition of two nuber is:"+c);
        sc.close();
    }
}
