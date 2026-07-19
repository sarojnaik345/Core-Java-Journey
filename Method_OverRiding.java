import java.util.Scanner;

class Parent {
    void show(int a , int b)
    {
        int c = a+b;
        System.out.println("Addition is "+c);
    }
}
class Child extends Parent{
    void show(int a , int b)
    {
        super.show(a, b);
        int c = a-b;
        System.out.println("Substraction is "+c);
    }
}
public class Method_OverRiding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Child ob = new Child();
        ob.show(x, y);
        sc.close();
    }
}
