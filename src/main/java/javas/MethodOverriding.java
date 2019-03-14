package javas;


class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
     void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
}
 
public class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();          //Output : From Sub Class
    }
}