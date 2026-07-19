import java.util.Scanner;

public class Area_of_Circle_Using_Constructor {
    Area_of_Circle_Using_Constructor(int radius)
    {
        double  area = 3.14f*radius *radius;
        double perimeter = 2* 3.14f* radius;
        System.out.println("Area of the circle whose radius is "+radius+"is :"+area);
        System.out.printf(" Perimeter of the circle whose radius is %d is %.2f",radius ,perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = sc.nextInt();
        Area_of_Circle_Using_Constructor ob = new Area_of_Circle_Using_Constructor(radius);
    }
}
