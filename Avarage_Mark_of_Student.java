import java.util.*;
class Avarage_Mark_of_Student
{
 public static void main(String args[])
 {
	int mark,avg_mark =0,no_of_student;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of student:");
	no_of_student = sc.nextInt();
	for(int i =1;i<=no_of_student;i++)
	{
		System.out.println("enter student"+i+" mark:");
		mark= sc.nextInt();
		avg_mark+=mark;
	}
	avg_mark /=no_of_student;
	System.out.println("Avarege of student is :"+avg_mark);

 }

}
