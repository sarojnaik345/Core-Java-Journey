class P{
    void Odd_Even(int num)
    {
        if(num%2==0)
            System.out.println(num+" is even number");
        else
            System.out.println(num+" is odd number");
    }
}
class Child1 extends P{
    void max_among_3_no(int num1, int num2,int num3)
    {
        // int m=max(num1,num2,num3);
        if(num1>=num2 && num1>=num3)
            System.out.println(num1+" is max among an three number");
       else if(num2>=num1 && num2>=num3)
            System.out.println(num2+" is max among an three number");
        else
            System.out.println(num3+" is max among an three number");
    }
}
class Check_number extends P
{
    void check(int num)
    {
        switch(num)
        {
            case '0':
                System.out.println(num+" is zero");
            case ():

        }
        // if(num==0)
        //     System.out.println(num+" is Zero");
        // else if(num>0)
        //     System.out.println(num+" is Positive");
        // if(num<0)
        //     System.out.println(num+" is Negetive");
    }
}
public class Q4  {
    public static void main(String args[])
    {
 Check_number ob = new Check_number();
 ob.check(0);

 Child1 ob1 = new Child1();
 ob1.max_among_3_no(2,3,4);
 ob.Odd_Even(6);
    }
}
