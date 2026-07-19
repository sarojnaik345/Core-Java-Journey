import java.util.*;
public class Month_as_String_case {
    public  static void main(String args[]){
           
            Scanner sc = new Scanner(System.in);
             System.out.println("enter your month:");
            String month = sc.next();
            
            switch(month){
                case "January": case "March": case "May": case "July": case "August": case "October": case "December":
                    System.out.println(month+" is of 31 days");
                    break;
                 case "january": case "march": case "may": case "july": case "august": case "october": case "december":
                    System.out.println(month+" is of 31 days");
                    break;
                case "April": case "June": case "September": case "November":
                    System.out.println(month+" is  of 30 days");
                    break;
                case "april": case "june": case "september": case "november":
                    System.out.println(month+" is  of 30 days");
                    break;
                case "Fabruary":case "fabruary":
                    System.out.println(month+" is of 28 days");
                    break;
                default:
                    System.out.println("Invalid Month");
            }
            sc.close();

 
        }
}
