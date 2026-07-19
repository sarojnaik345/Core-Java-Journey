//Wap to print details of Student,teacher and staff using multilevel inheritance
class Staff{
    void staff(String name, int contact){
        System.out.println("I am a staff and my Name is "+name+"and here is my contact info"+contact);
    }
}
class Teacher extends Staff{
    void teacher(String name,int contact){
        System.out.println("I am a teacher and my Name is "+name+"and here is my contact info"+contact);
    }
}
class Student extends Teacher{
    void student(String name,int mark,int contact)
    {
        System.out.println("I am a Student and my Name is "+name+"and here is my contact info"+contact+ " with mark"+mark);
    }
}
public class Student_Teacher_Staff_Datails extends Student  {
    public static void main(String arg[])
    {
        Student_Teacher_Staff_Datails ob = new Student_Teacher_Staff_Datails();
        ob.staff("Ram",123456);
        ob.teacher("Prasant",987345);
        ob.student("Manash",90,234567);
    }
}
