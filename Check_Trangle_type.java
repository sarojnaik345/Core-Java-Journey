import java.util.Scanner;

public class Check_Trangle_type {
    public static void main(String args[])
    {
        int side1, side2, side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side1:");
        side1 = sc.nextInt();
        System.out.println("enter the side2:");
        side2 = sc.nextInt();
        System.out.println("enter the side3:");
        side3 = sc.nextInt();

        if((side1<side2 + side3) && (side2<side2+side3) && (side3<side1+side3))
        {
            if(side1==side2 && side1==side3 && side2==side3)
                System.out.println("Equilateral triange.");
            else if (side1 == side2 || side2 == side3 || side3 == side1)
                System.out.println("isoscale triangle.");
            else  if (side1 !=side2 && side1!=side3 && side2!= side3)
                System.out.println("Sclene Trinagle");
        }
        else
            System.out.println("its not a triangle.");
        sc.close();
    }
}
