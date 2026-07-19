import java.util.Scanner;

public class Electricity_Unit_charges {
    public static  void main(String args[])
    {
        double first_50 = 50,next_100 =100,consumed_unit;
        double electricity_Unit_charges=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the about of  elsctric unit you  have consumed:");
        consumed_unit= sc.nextDouble();
        double real_consumed_unit = consumed_unit;
        if(consumed_unit<=50&& consumed_unit>=0)
        {
            electricity_Unit_charges = consumed_unit *0.50;
            
        }
        else if(consumed_unit<=150)
        {
            electricity_Unit_charges =first_50 *0.50;
            electricity_Unit_charges+=((consumed_unit-first_50)*0.75);
        }
       else if(consumed_unit<=250 && consumed_unit>150)
        {
            electricity_Unit_charges = first_50 *0.50;
            consumed_unit-=first_50;
            electricity_Unit_charges+=(next_100)*0.75;
            consumed_unit-=next_100;
            electricity_Unit_charges+=(consumed_unit*1.2);
        }
       else if(consumed_unit>250 )
        {
            electricity_Unit_charges = first_50 *0.50;
            consumed_unit-=first_50;
            electricity_Unit_charges+=next_100*0.75;
            consumed_unit-=next_100;
            electricity_Unit_charges+=(next_100*1.2);
           double remain_unit= consumed_unit-next_100;
            electricity_Unit_charges+=(remain_unit*1.5);
           
        }
        else{
            System.out.println("invalid unit");
            return;
        }
            
        sc.close();
         electricity_Unit_charges+=(electricity_Unit_charges*0.2);
     System.out.println("Electric bill for "+real_consumed_unit+" unit consumtion is : "+electricity_Unit_charges);
    }
}
