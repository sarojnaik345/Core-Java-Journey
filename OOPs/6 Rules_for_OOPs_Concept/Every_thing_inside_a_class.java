// package Rules_for_OOPs_Concept;

import java.util.Scanner;

public class Every_thing_inside_a_class {
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the radius :");
        int radius = sc.nextInt();
         float c = 3.14f*radius*radius;
         System.out.println("area of circle is :"+c);
         sc.close();
    }
}
