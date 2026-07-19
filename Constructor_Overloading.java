public class Constructor_Overloading {
    Constructor_Overloading(int a, int b)
    {
        int c = a+b;
        System.out.println("Addition is "+c);
    }
    Constructor_Overloading(double a, int b)
    {
         double c = a+b;
        System.out.println("Addition is "+c);
    }

    public static void main(String[] args) {
        Constructor_Overloading ob = new Constructor_Overloading(9.9, 5);
        Constructor_Overloading ob1 = new Constructor_Overloading(9, 5);
    }
}
