// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;

public class Sum_Till_user_Input_X {
   
    public static void main(String args[]) 
    { 
        // Scanner sc = new Scanner(System.in);
        // int sum = 0;
        // // BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        // while(true)
        // {
        //     int a;
        //         for(int i=0;true;i++)
        //         {
        //             char b = args[i].charAt(0);
        //         // a = Integer.parseInt(args[i]);
        //         if(b=='x' ||b=='X')
        //             break;
        //        switch (b) {
        //         case 'X':case 'x':
                    
        //             break;
               
        //         default:
        //              a = (int)b;
        //               sum+=a;
        //        }
        //         }
        //     }
        //      System.out.println(sum);
          
        //     }
        int sum =0;
        String x ="X";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
       while (true) {
        
         String a = sc.next();
         if(a.equalsIgnoreCase(x) )
            break;
         sum +=Integer.parseInt(a);
       }
       System.out.print("sum is :"+sum);

             
        }
    }
        
    

