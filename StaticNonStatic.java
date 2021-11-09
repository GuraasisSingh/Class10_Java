
/**
 * Static can access static only
 * Member(Non-Static) can access anything
 * Static can indirectly access non-static via an object
 */
public class StaticNonStatic
{
   int m;//belongs to the object
   static int q;//belongs to entire class even if there is no object
   static void add()
   {
      int g;//its a local variable
   }
   void show()
   {
       StaticNonStatic a = new StaticNonStatic();//a->m
       StaticNonStatic b = new StaticNonStatic();//b->m
   }
}
class StaticNonStatic_School
{
    String studentsName;
    static String schoolName;//available to entire class without the presence of object
    void main()
    {
        StaticNonStatic_School boy =new StaticNonStatic_School(); //will get studentName 
        StaticNonStatic_School girl= new StaticNonStatic_School();//will get studentName 
    }
}
class StaticNonStatic_Test
{
    int x=66;//instance or object variable
    static int y=99;//class variable
    public void method()//member method
    {
        System.out.println("y="+y);
        System.out.println("x="+x);
    }
    public static void statMethod()//class method
    {
        System.out.println("y="+y);//class method can only use class variable
        //System.out.println("x="+x);
        //This statement can't be excuted as class method cannot use instance variable
    }
    public static void main()
    {
        //it can call statMethod() in the following ways:
        //by calling through class
        statMethod();//if in same class 
        StaticNonStatic_Test.statMethod();//from anywhere
        //by creating an object
        //however not an intelligent way
        StaticNonStatic_Test t=new StaticNonStatic_Test();
        t.statMethod();
        //On the other hand member methods can only be called with the help of an object
        t.method();
        
    }
}





