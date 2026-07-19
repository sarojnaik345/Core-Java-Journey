import java.util.*;
class BMI_Index
{
	public static void main(String srg[])
	{
	 float weight , height, BMI;
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter  your weight in kg:");
	 weight =  obj.nextFloat();
 	 System.out.println("Enter  your height in meter:");
 	 height = obj.nextFloat();

	// System.out.println("Enter  your weight in kg:");

	 BMI = (weight/(height*height));
	System.out.println("BMI of as per your data is : "+BMI);
	}

}