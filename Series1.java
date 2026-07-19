import java.util.Scanner;

public class Series1 {
    public static void main(String args[])
    {
        int range,previous_numb=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range for series:");
        range= sc.nextInt();
        for(int i =1;i<=range;i++)
        {
            if(i%2!=0)
            {
                 previous_numb+=i;
                 System.out.print(" "+previous_numb);
            }
            // else
                // System.out.print(previous_numb);

                
        }
        sc.close();
    }
}
