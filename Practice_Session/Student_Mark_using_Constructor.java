import java.io.*;
class StudentReport{
    private int totalmark;
    private int mark1;
    private int mark2;

    // void setMark()
    // {
        
    // }
    // void getMark()
    // {
    //     System.out.println(mark1);
    //     System.out.println(mark2);
    //     System.out.println(totalmark);
    // }
   StudentReport(int mark1,int mark2)
    {
        this.mark1 = mark1;
        this.mark2= mark2;
        this.totalmark = this.mark1+this.mark2;
        int fullMark = 200;
        float percentage = (this.totalmark/200.0f)*100;
        System.out.println("Full mark of student is :"+fullMark);
        System.out.println("Total Secured mark  by the student is :"+totalmark);
        System.out.println("Percentage of student is :"+percentage);
        if(percentage>90)
        {
            System.out.println("A");
        }
       else if(percentage>80)
        {
            System.out.println("B");
        }
       else if(percentage>70)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }

    }

}
public class Student_Mark_using_Constructor {
    public static void main(String args[]) 
    {
       try{
         BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Subject 1 mark: ");
        int sub1 = Integer.parseInt(ob.readLine());
        // System.out.println();
        System.out.print("Enter Subject 2 mark: ");
        int sub2 = Integer.parseInt(ob.readLine());
        //  std.setMark();
        StudentReport std = new StudentReport( sub1,sub2);
       
        // std.getMark();
        
       }
       catch(IOException io)
       {
        System.out.println(io);
       }

    }
}
