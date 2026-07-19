import java.util.*;
class Attendence_percentage
{
 public static void main(String args[])
 {
	float total_classes_held, total_class_attended,attendence_percentage;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the total_classes_held:");
	total_classes_held = sc.nextFloat();
	System.out.println("enter the total_class_attended:");
	total_class_attended = sc.nextFloat();
	 attendence_percentage = ((total_class_attended/total_classes_held)*100);
	
	System.out.println("attendence in percentage is :"+attendence_percentage);

 }

}
