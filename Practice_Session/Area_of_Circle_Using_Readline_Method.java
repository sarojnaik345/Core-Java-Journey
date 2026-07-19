import java.io.*;
class Circle
{
    Circle(int radius){
        double area = 3.14f * Math.pow(radius,2);
       double perimiter = 2* 3.14f * radius;
         System.out.println("Area  of the circle is with radius = "+radius+" is :"+area);
        System.out.print("Peremiter  of the circle is with radius = "+radius+" is :"+perimiter);
    }
    

}
public class Area_of_Circle_Using_Readline_Method {
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(obj);
        System.out.println("enter the radius  of the circle:");
        int radius = Integer.parseInt(ob.readLine());

        Circle cl = new Circle(radius);
        

    }
}
