import java.beans.ParameterDescriptor;

class Parent{
    void i_am_parent(){
        System.out.println("I am parent class of Multilevel Inheritance");
    }
}
/**
 * intermediate_child
 */
class Intermediate_child extends Parent {
    void intermediate_child()
    {
        System.out.println("I am intermediate child of and extend of Parent class. ");
    }
 
}
public class Multilevel_Inheritance extends Intermediate_child {
    void  multilevel_Inheritance()
    {
        System.out.println(" I am child which extend intermediate which extend Parent ");
    }
    public static void  main(String args[])
    {
        Multilevel_Inheritance ob = new Multilevel_Inheritance();
        ob.i_am_parent();
        ob.intermediate_child();
        ob.multilevel_Inheritance();
    }
}
