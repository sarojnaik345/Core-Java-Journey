import java.util.Scanner;

class Test{
    private String name;
    private int roll;
    private int age;
    private double mark;
    
    public void setName(String name)
    {
        this.name = name;
    }
   public void setRoll(int roll)
    {
        this.roll = roll;
    }
   public void setAge(int age)
    {
        this.age = age;
    }
    public void setMark(double mark)
    {
        this.mark = mark;
    }
    public String getName()
    {
       return name;
    }
    public int getRoll()
    {
       return roll;
    }
    public int getAge()
    {
        return age;
    }
    public double getMark()
    {
        return mark;
    }
}
class Multiple_Inheritance_01{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Test ob = new Test();
        System.out.println("enter the name:");
        String name = sc.nextLine();
        System.out.println("enter the roll:");
        int roll = sc.nextInt();
        System.out.println("enter the age:");
        int age = sc.nextInt();
        System.out.println("enter the mark:");
        double mark = sc.nextDouble();
        ob.setName(name);
        ob.setRoll(roll);
        ob.setAge(age);
        ob.setMark(mark);
        System.out.println("Name is :"+ob.getName());
        System.out.println("Roll no is : "+ob.getRoll());
        System.out.println("Age is : "+ob.getAge());
        System.out.println("Double is : "+ob.getMark());
        sc.close();

    }
}