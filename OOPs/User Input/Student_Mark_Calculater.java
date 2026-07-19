import java.io.*;
class Student_Mark_Calculater
{
public static void main(String  args[]) throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader ob = new BufferedReader(ab);
System.out.print("Enter student name:");
String Name = ob.readLine();
System.out.print("Enter mark of subject1:");
int subject1 = Integer.parseInt(ob.readLine());
System.out.print("Enter mark of subject2:");
int subject2 = Integer.parseInt(ob.readLine());
System.out.print("Enter mark of subject3:");
int subject3 = Integer.parseInt(ob.readLine());
float total = subject1+subject2+subject3;
float avarage = (subject1+subject2+subject3)/3;
System.out.println();
System.out.println();
System.out.println("-----------Student Report-----------------");
System.out.print("Name of the student is: "+Name);
System.out.println();
System.out.print("Subjec1 	        : "+subject1);
System.out.println();
System.out.print("Subject2 	        : "+subject2);
System.out.println();
System.out.print("Subject3	        : "+subject3);
System.out.println();
System.out.print("Avarage 	        : "+avarage);
System.out.println();
System.out.print("Toatal                : "+total);
System.out.println();
float percentage =(int)((total/300.0f)*100);

if(percentage>=90)
System.out.print("Grade                 : A");
else if(percentage>=80 )
System.out.print("Grade                 : B");
else if(percentage>=70 )
System.out.print("Grade                 : c");
else if(percentage>=60 )
System.out.print("Grade                 : D");
else
System.out.print("Grade                 : E");

}
}