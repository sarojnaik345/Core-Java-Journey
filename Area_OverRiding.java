import java.util.*;
class Circle{
    Scanner sc = new Scanner(System.in);
    void area(int r){
        double area = (3.14f)*r*r;
        System.out.println("Area of Circle is "+area);
    }
}
class Squre extends Circle{
    void area(int r)
    {
        System.out.println("Enter the radius for Circle");
        int Circle_radius= sc.nextInt();
        super.area(Circle_radius);
        double area = r*r;
        System.out.println("area of squre is "+area);
    }
}
class SemiCircle extends Squre{
    void area(int r)
    {
        System.out.println("Enter the side  for Squre");
        int s = sc.nextInt();
        super.area(s);
        double area =(3.14f*r*r)/2;
        System.out.println("area of SemiCircle is "+area);
    }
}
public class Area_OverRiding {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Semicircle radius :");
        int r = sc.nextInt();
        SemiCircle  ob = new SemiCircle();
        ob.area(r);
        sc.close();
    }
    
}
