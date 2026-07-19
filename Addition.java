import java.util.*;
public class Addition {
    Addition( int x, int y)
    {
        int c = x+y;
        System.out.println("Addition of "+x+" and "+y+" is "+c);
    }
    Addition( float x1, float y1)
    {
        float c = x1-y1;
        System.out.println("Addition of "+x1+" and "+y1+" is "+c);
    }
    public static void  main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Interger value :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Addition ob = new Addition(x,y);

        // Scanner ob1 = new Scanner(System.in);
        System.out.println("Enter Float value :");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        Addition ob1 = new Addition(x1,y1);


    }
}
