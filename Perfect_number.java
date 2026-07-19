import java.util.Scanner;

public class Perfect_number {
    public static void main(String args[])
    {
        int num,perfect=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber to check perfect number:");
        num = sc.nextInt();

        for(int i =1;i<=(num/2);i++)
        {
            if(num%i==0){
                perfect+=i;
            }
        }
        sc.close();
        if (num==perfect)
            System.out.print(num+" is  a perfect number");
        else
            System.out.print(num+" is  not a perfect number");
    }
}
