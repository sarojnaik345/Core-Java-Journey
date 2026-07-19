class Method_OverLoading{
    void display(int a, double b)
    {
        double c = a+b;
        System.out.println("Addition is "+c);
    }
    void display(int a, int b)
    {
        int c = a%b;
        System.out.println("Modulation is "+c);
    }

    public static void main(String args[])
    {
        Method_OverLoading ob = new Method_OverLoading();
        ob.display(5, 5.0);
    }
}