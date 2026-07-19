import java.util.Scanner;

public class Calculate_percentage_grade {
    public static void main(String args[])
    {
        int physic,chemisty,biology,mathematics,computer,total_mark =500;
        float total_mark_of_student;
        float Calculate_percentage_;

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter total mark for a subject:");
        // total_mark = sc.nextInt();
        System.out.println("enter physic mark:");
        physic = sc.nextInt();
        System.out.println("enter chemisty mark:");
        chemisty = sc.nextInt();
        System.out.println("enter biology mark:");
        biology = sc.nextInt();
        System.out.println("enter mathematics mark:");
        mathematics = sc.nextInt();
        System.out.println("enter computer mark:");
        computer = sc.nextInt();
        
        total_mark_of_student= (physic + chemisty + biology + mathematics + computer);
        Calculate_percentage_= (total_mark_of_student/total_mark)*100;
        if(Calculate_percentage_>=90)
            System.out.println(" You achived grade A with percentage "+Calculate_percentage_+"%");
        else if(Calculate_percentage_>=80)
            System.out.println(" You achived grade B with percentage "+Calculate_percentage_+"%");
        else if(Calculate_percentage_>=70)
            System.out.println(" You achived grade C with percentage "+Calculate_percentage_+"%");
        else if(Calculate_percentage_>=60)
            System.out.println(" You achived grade D with percentage "+Calculate_percentage_+"%");
       else if(Calculate_percentage_<40)
            System.out.println(" You achived grade f with percentage "+Calculate_percentage_+"% and you are fail"  );
        else
            System.out.println("walha");
        sc.close();
    }
}
