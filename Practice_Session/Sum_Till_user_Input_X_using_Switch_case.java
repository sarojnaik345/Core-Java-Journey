// import java.io.*;
// import java.util.Scanner;
public class Sum_Till_user_Input_X_using_Switch_case{
    public static  void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0;i<args.length;i++)
        {
            // args[i]= sc.next();
            String a = args[i];
            if(a.equalsIgnoreCase("x"))
            {
            break;
            }
            try{
                int b = Integer.parseInt(a);
            sum+=b;
            }
            catch(NumberFormatException ne)
            {
                System.out.println(ne);
            }

        }
System.out.println(sum);


    }
}

        