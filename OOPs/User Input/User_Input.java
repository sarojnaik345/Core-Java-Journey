import java.io.*;
public class User_Input {
    public static void main(String args[]) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(isr);
        System.out.println("Enter two number :");
        int a = Integer.parseInt(ob.readLine());
        int b = Integer.parseInt(ob.readLine());
        int c = a+b;
        System.out.println("sum is :"+c);
    }
}
