final class A
{
	final void test()
	{
 	System.out.println("possible");
	}
}
public class Final_test1 extends A {
void test()
{
 System.out.println("not possible");
}


    public static void main(String args[])
    {
final int a=0;
       Final_test1 ob = new Final_test1();
        System.out.println(a);
ob.test();

    }
}
