class One{
     One()
     {
        System.out.println("parent class");
     }
}
class Two extends One{
    void child_method()
    {
        System.out.println("i am single child of One");
    }
    public static void main(String args[])
    {
        Two ob = new Two();
        ob.child_method();
    }
}