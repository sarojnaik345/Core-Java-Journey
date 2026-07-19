import java.util.*;

class BMI_Index1 
{
    public static void main(String srg[]) 
    {
        float weight, height, BMI;
        char choice;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter your weight in kg:");
        weight = obj.nextFloat();
        
        System.out.println("How do you want to give the height?");
        System.out.println("m. Meter");
        System.out.println("c. Centimeters");
        choice = obj.next().charAt(0);
        
        if (choice == 'M' || choice == 'm') 
        {
            System.out.println("Enter your height in meter:");
            height = obj.nextFloat();
            BMI = (weight / (height * height));
            System.out.println("BMI as per your data is: " + BMI);
        }
        else if (choice == 'c' || choice == 'C') 
        {
            System.out.println("Enter your height in centimeters:");
            height = obj.nextFloat();
            height = height / 100;
            BMI = (weight / (height * height));
            System.out.println("BMI as per your data is: " + BMI);
        }
        else 
        {
            System.out.println("Invalid choice selection.");
        }
        
        obj.close(); // Good practice to close the scanner
    }
}
